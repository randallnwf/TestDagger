package com.wayfair.testdagger2;

import android.app.Application;
import android.content.res.Resources;

import dagger.Module;
import dagger.Provides;

@Module
abstract class AppModule {

    @Provides
    static Resources provideResources(Application app) {
        return app.getResources();
    }
}
