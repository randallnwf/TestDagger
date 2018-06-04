package com.wayfair.testdagger2;

import android.app.Application;
import android.content.res.Resources;

import com.wayfair.base.BaseComponent;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = AppModule.class,
        dependencies = BaseComponent.class)
@AppScope
public interface AppComponent {

    void inject(MainApplication mainApplication);

    void inject(MainActivity mainActivity);

    Resources resources();

    @Component.Builder
    interface Builder {
        AppComponent build();

        @BindsInstance
        Builder application(Application app);

        Builder baseComponent(BaseComponent component);
    }
}
