package com.wayfair.testdagger2

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var res: Resources

    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {

        val app = application as MainApplication
        app.appComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appName = res.getString(R.string.app_name)
        Log.d("MainActivity", "appName: $appName")
        Log.d("MainActivity", "packageName: $context.packageName")
    }
}
