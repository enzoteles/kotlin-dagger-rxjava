package com.example.enzoteles.myapplication.main;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/enzoteles/myapplication/main/OnMainMVP;", "", "MainInteractor", "MainPresenter", "MainView", "app_debug"})
public abstract interface OnMainMVP {
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/enzoteles/myapplication/main/OnMainMVP$MainView;", "", "resultMsgView", "", "listContacts", "", "Lcom/example/enzoteles/myapplication/model/Contact;", "context", "Landroid/content/Context;", "recycler", "Landroid/support/v7/widget/RecyclerView;", "app_debug"})
    public static abstract interface MainView {
        
        public abstract void resultMsgView(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.enzoteles.myapplication.model.Contact> listContacts, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView recycler);
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J&\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lcom/example/enzoteles/myapplication/main/OnMainMVP$MainPresenter;", "", "callPresenter", "", "context", "Landroid/content/Context;", "recycler", "Landroid/support/v7/widget/RecyclerView;", "resultMsgView", "listContacts", "", "Lcom/example/enzoteles/myapplication/model/Contact;", "app_debug"})
    public static abstract interface MainPresenter {
        
        public abstract void callPresenter(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView recycler);
        
        public abstract void resultMsgView(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.enzoteles.myapplication.model.Contact> listContacts, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView recycler);
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/enzoteles/myapplication/main/OnMainMVP$MainInteractor;", "", "resultMsg", "", "context", "Landroid/content/Context;", "recycler", "Landroid/support/v7/widget/RecyclerView;", "app_debug"})
    public static abstract interface MainInteractor {
        
        public abstract void resultMsg(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView recycler);
    }
}