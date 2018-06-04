package com.wayfair.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class BaseModule {

    private Application app;

    public BaseModule(Application app) {
        this.app = app;
    }

    @Provides
    Application provideApplication() {
        return app;
    }

    @Provides
    Context provideAppContext(Application app) {
        return app;
    }
}
