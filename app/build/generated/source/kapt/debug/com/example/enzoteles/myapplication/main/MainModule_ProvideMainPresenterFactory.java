// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.enzoteles.myapplication.main;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class MainModule_ProvideMainPresenterFactory
    implements Factory<OnMainMVP.MainPresenter> {
  private final MainModule module;

  public MainModule_ProvideMainPresenterFactory(MainModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OnMainMVP.MainPresenter get() {
    return Preconditions.checkNotNull(
        module.provideMainPresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OnMainMVP.MainPresenter> create(MainModule module) {
    return new MainModule_ProvideMainPresenterFactory(module);
  }
}
