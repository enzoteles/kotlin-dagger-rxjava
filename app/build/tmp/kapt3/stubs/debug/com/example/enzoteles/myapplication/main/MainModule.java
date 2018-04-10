package com.example.enzoteles.myapplication.main;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/enzoteles/myapplication/main/MainModule;", "", "()V", "provideMainInteractor", "Lcom/example/enzoteles/myapplication/main/OnMainMVP$MainInteractor;", "provideMainPresenter", "Lcom/example/enzoteles/myapplication/main/OnMainMVP$MainPresenter;", "app_debug"})
@dagger.Module()
public final class MainModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.enzoteles.myapplication.main.OnMainMVP.MainPresenter provideMainPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.enzoteles.myapplication.main.OnMainMVP.MainInteractor provideMainInteractor() {
        return null;
    }
    
    public MainModule() {
        super();
    }
}