package com.wayfair.testdagger2

import android.app.Application
import android.content.res.Resources
import android.util.Log
import com.wayfair.base.BaseModule
import com.wayfair.base.DaggerBaseComponent
import javax.inject.Inject

class MainApplication : Application() {

    lateinit var appComponent: AppComponent
        private set

    @Inject
    lateinit var res: Resources

    override fun onCreate() {

        val baseComponent = DaggerBaseComponent.builder()
                .baseModule(BaseModule(this))
                .build()
        appComponent = DaggerAppComponent.builder()
                .baseComponent(baseComponent)
                .appModule(AppModule(this))
                .build()
        appComponent.inject(this)

        super.onCreate()

        val appName = res.getString(R.string.app_name)
        Log.d("MainApplication", appName)
    }
}