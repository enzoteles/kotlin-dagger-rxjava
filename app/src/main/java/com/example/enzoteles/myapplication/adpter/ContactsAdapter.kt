package com.example.enzoteles.myapplication.adpter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.enzoteles.myapplication.R
import com.example.enzoteles.myapplication.context.ContentActivityK
import com.example.enzoteles.myapplication.model.Contact
import kotlinx.android.synthetic.main.list_item.view.*


/**
 * Created by enzoteles on 14/01/18.
 */

class ContactsAdapter(val contacts: MutableList<Contact>, val context: Context) : Adapter<ContactsAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val contact = contacts[position]
        holder?.let {
            it.itemView.txt_nome.text = contact.name
            it.itemView.txt_email.text = contact.email

            it.itemView.setOnClickListener { view ->
                context.startActivity(Intent(context, ContentActivityK::class.java).apply {
                    putExtra("contact", contact)
                })
            }

        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}
}

