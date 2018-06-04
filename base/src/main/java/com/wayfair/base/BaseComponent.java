package com.wayfair.base;

import android.app.Application;
import android.content.Context;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = BaseModule.class)
@BaseScope
public interface BaseComponent {

    Context context();

    @Component.Builder
    interface Builder {
        BaseComponent build();

        @BindsInstance
        Builder application(Application app);
    }
}
