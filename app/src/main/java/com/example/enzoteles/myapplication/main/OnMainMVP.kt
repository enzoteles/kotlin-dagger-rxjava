package com.example.enzoteles.myapplication.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import com.example.enzoteles.myapplication.model.Contact

/**
 * Created by enzoteles on 12/01/18.
 */
interface OnMainMVP {
    
    interface MainView{
        fun resultMsgView(listContacts: MutableList<Contact>, context: Context, recycler: RecyclerView)
    }
    interface MainPresenter{
        fun callPresenter(context: Context, recycler: RecyclerView)
        fun resultMsgView(listContacts: MutableList<Contact>, context: Context, recycler: RecyclerView)
    }
    interface MainInteractor{
        fun resultMsg(context: Context, recycler: RecyclerView)
    }
}