package com.example.enzoteles.myapplication.context

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.widget.ArrayAdapter
import com.example.enzoteles.myapplication.R
import com.example.enzoteles.myapplication.adpter.ContactsAdapter
import com.example.enzoteles.myapplication.model.Contact
import kotlinx.android.synthetic.main.contact_item.*

class ContentActivityK : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.contact_item)

        with(intent){
            val contact:Contact = getSerializableExtra("contact") as Contact
            txt_nome.text = contact.name
            txt_email.text = contact.email
            txt_address.text = contact.address
            txt_gender.text = contact.gender
        }
    }
    }
