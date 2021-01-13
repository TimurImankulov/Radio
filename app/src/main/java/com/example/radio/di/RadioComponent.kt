package com.example.radio.di

import com.example.radio.di.modules.AppModule
import com.example.radio.di.modules.ExoPlayerModule
import com.example.radio.di.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ExoPlayerModule::class,
        NetworkModule::class
    ]
)
interface RadioComponent {
    fun inject(injector: Injector)
}