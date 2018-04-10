package com.example.enzoteles.myapplication.main;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/example/enzoteles/myapplication/main/MainInteractor;", "Lcom/example/enzoteles/myapplication/main/OnMainMVP$MainInteractor;", "presenter", "Lcom/example/enzoteles/myapplication/main/OnMainMVP$MainPresenter;", "(Lcom/example/enzoteles/myapplication/main/OnMainMVP$MainPresenter;)V", "listContacts", "", "Lcom/example/enzoteles/myapplication/model/Contact;", "getListContacts", "()Ljava/util/List;", "setListContacts", "(Ljava/util/List;)V", "getPresenter", "()Lcom/example/enzoteles/myapplication/main/OnMainMVP$MainPresenter;", "resultMsg", "", "context", "Landroid/content/Context;", "recycler", "Landroid/support/v7/widget/RecyclerView;", "app_debug"})
public final class MainInteractor implements com.example.enzoteles.myapplication.main.OnMainMVP.MainInteractor {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.enzoteles.myapplication.model.Contact> listContacts;
    @org.jetbrains.annotations.NotNull()
    private final com.example.enzoteles.myapplication.main.OnMainMVP.MainPresenter presenter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.enzoteles.myapplication.model.Contact> getListContacts() {
        return null;
    }
    
    public final void setListContacts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.enzoteles.myapplication.model.Contact> p0) {
    }
    
    @java.lang.Override()
    public void resultMsg(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recycler) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.enzoteles.myapplication.main.OnMainMVP.MainPresenter getPresenter() {
        return null;
    }
    
    public MainInteractor(@org.jetbrains.annotations.NotNull()
    com.example.enzoteles.myapplication.main.OnMainMVP.MainPresenter presenter) {
        super();
    }
}