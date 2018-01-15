package com.example.enzoteles.myapplication.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by enzoteles on 12/01/18.
 */

data class JsonExample(val contacts:List<Contact>)

data class Contact(val id:String, val name:String, val email:String, val address:String,
                   val gender:String): Serializable

data class Phone(val mobile:String, val home:String, val office:String)


