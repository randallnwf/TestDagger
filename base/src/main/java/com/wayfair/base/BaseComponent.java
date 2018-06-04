package com.wayfair.base;

import android.content.Context;

import dagger.Component;

@Component(modules = BaseModule.class)
public interface BaseComponent {

    Context context();

    @Component.Builder
    interface Builder {
        BaseComponent build();

        Builder baseModule(BaseModule module);
    }
}
