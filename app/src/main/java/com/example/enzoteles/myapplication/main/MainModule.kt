package com.example.enzoteles.myapplication.main

import dagger.Module
import dagger.Provides

/**
 * Created by enzoteles on 12/01/18.
 */
@Module
class MainModule{

    @Provides
    fun provideMainPresenter(): OnMainMVP.MainPresenter {
        return MainPresenter(MainActivityK())
    }

    @Provides
    fun provideMainInteractor(): OnMainMVP.MainInteractor {
        return MainInteractor(MainPresenter(MainActivityK()))
    }
}