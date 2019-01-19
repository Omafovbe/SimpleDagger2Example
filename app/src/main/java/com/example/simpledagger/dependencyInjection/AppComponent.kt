package com.example.simpledagger.dependencyInjection

import com.example.simpledagger.MyApplication
import dagger.Component

@Component(
    modules = [
        ActivitiesModule::class
    ]
)
interface AppComponent {
    fun inject(myApplication: MyApplication)
}