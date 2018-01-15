package com.example.enzoteles.myapplication.service

import com.example.enzoteles.myapplication.model.Contact
import com.example.enzoteles.myapplication.model.JsonExample
import com.google.gson.GsonBuilder
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by enzoteles on 12/01/18.
 */
class ContactApi{

    val service:ContactApiRest


    init {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging).build()

        val gson = GsonBuilder().setLenient().create()

        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("https://api.androidhive.info/")
                .client(httpClient.build())
                .build()
        service = retrofit.create<ContactApiRest>(ContactApiRest::class.java)
    }

    fun loadContacts(): Observable<JsonExample>? {

        return service.listContacts()
    }

}