package com.example.simpledagger.dependencyInjection

import com.example.simpledagger.myApplication
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivitiesModule::class
    ]
)
interface AppComponent {
    fun inject(myApplication: myApplication)
}