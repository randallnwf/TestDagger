package com.wayfair.testdagger2;

import android.app.Application;
import android.content.res.Resources;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Application app;

    public AppModule(Application app) {
        this.app = app;
    }

    @Provides
    Resources provideResources() {
        return app.getResources();
    }
}
