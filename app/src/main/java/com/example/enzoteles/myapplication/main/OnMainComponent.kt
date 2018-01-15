package com.example.enzoteles.myapplication.main

import dagger.Component

/**
 * Created by enzoteles on 12/01/18.
 */
@Component(modules = arrayOf(MainModule::class))
interface OnMainComponent {

    fun provideMainPresenter(): OnMainMVP.MainPresenter
    fun provideMainInteractor(): OnMainMVP.MainInteractor
}