package com.example.enzoteles.myapplication.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import com.example.enzoteles.myapplication.model.Contact

/**
 * Created by enzoteles on 12/01/18.
 */
class MainPresenter(val view: OnMainMVP.MainView): OnMainMVP.MainPresenter {


    /**
     * Método que instancia o interactor via dagger 2 e chama o método resultMsg passando o contexto e o recyclerview
     * @param context
     * @param recycler
     * */
    override fun callPresenter(context: Context, recycler: RecyclerView) {
        //init dagger component
        val mainComponent = DaggerOnMainComponent.builder().mainModule(MainModule()).build()
        //instanciando o interactor via dagger
        var interactor = mainComponent.provideMainInteractor()
        //chando método de resultMsg
        interactor.resultMsg(context, recycler);
    }

    /**
     * método que envia a lista de contatos para view
     * @param listContacts
     * @param context
     * @param recycler
     * */
    override fun resultMsgView(listContacts: MutableList<Contact>, context: Context, recycler: RecyclerView) {
        view.resultMsgView(listContacts, context, recycler);
    }

}