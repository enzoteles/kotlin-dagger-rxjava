package com.example.enzoteles.myapplication.service

import com.example.enzoteles.myapplication.model.JsonExample
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by enzoteles on 12/01/18.
 */
interface ContactApiRest {

    @GET("contacts/")
    fun listContacts(): Observable<JsonExample>

    /**
     * Companion object to create the ContactApiRest
     * *//*
    companion object Factory{
        fun create(): ContactApiRest{
            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://api.androidhive.info/")
                    .build()
            return retrofit.create(ContactApiRest::class.java)
        }
    }*/
}