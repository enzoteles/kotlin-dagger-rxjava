package com.example.enzoteles.myapplication.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import com.example.enzoteles.myapplication.model.Contact
import com.example.enzoteles.myapplication.service.ContactApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by enzoteles on 12/01/18.
 */
class MainInteractor(val presenter: OnMainMVP.MainPresenter) : OnMainMVP.MainInteractor {

    //variable
    var listContacts = mutableListOf<Contact>()

    /**
     * método que utiliza o retrofit junto com rxjava e o padrão Observable
     * para pegar a lista de contatos do Json e depois retorna a lista de contatos para o presenter
     * @param context
     * @param recycler
     * */
    override fun resultMsg(context: Context, recycler: RecyclerView) {
        val api = ContactApi()
        api.loadContacts()
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe ({ contacts ->
                    contacts.contacts.forEach {
                        i -> listContacts.add(i)
                    }
                    presenter.resultMsgView(listContacts, context, recycler);
                }, { e ->
                    e.printStackTrace()
                })

    }

}

