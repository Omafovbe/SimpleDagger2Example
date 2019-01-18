package com.example.simpledagger

import android.app.Activity
import android.app.Application
import com.example.simpledagger.dependencyInjection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/*
HasActivityInjector ==> dagger-android
*/

class myApplication : Application(), HasActivityInjector {
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>


    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }

    override fun onCreate() {
        super.onCreate()

        //var appComponent = DaggerAppComponent.builder().build()
        var appComponent = DaggerAppComponent.create()

        appComponent.inject(this)
    }
}