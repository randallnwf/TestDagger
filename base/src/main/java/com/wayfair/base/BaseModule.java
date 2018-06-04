package com.wayfair.base;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

@Module
public interface BaseModule {

    @Binds
    Context provideAppContext(Application app);
}
