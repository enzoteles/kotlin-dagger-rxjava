package com.example.enzoteles.myapplication.main

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.widget.ArrayAdapter
import com.example.enzoteles.myapplication.R
import com.example.enzoteles.myapplication.adpter.ContactsAdapter
import com.example.enzoteles.myapplication.model.Contact
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityK : AppCompatActivity(), OnMainMVP.MainView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //recycleview init
        var recycler = recyclerView

        //init dagger component
        val mainComponent = DaggerOnMainComponent.builder().mainModule(MainModule()).build()
        //instanciando o presenter via dagger2
        var presenter = mainComponent.provideMainPresenter()
        //chamando o método do presenter
        presenter.callPresenter(this, recycler)

    }

    /**
     * método que retorna a lista de contatos do interactor para setar no adapter para fazer o bind dos componentes
     * @param listContacts
     * @param context
     * @param recycler
     * */
    override fun resultMsgView(listContacts: MutableList<Contact>, context: Context, recycler: RecyclerView) {

            recycler.adapter = ContactsAdapter(listContacts, context)
            var layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
            recycler.layoutManager = layoutManager

    }
}
