package com.wayfair.testdagger2;

import android.content.res.Resources;

import com.wayfair.base.BaseComponent;

import dagger.Component;

@Component(modules = AppModule.class,
        dependencies = BaseComponent.class)
public interface AppComponent {

    void inject(MainApplication mainApplication);

    void inject(MainActivity mainActivity);

    Resources resources();
}
