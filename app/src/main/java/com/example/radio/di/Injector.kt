package com.example.radio.di

import android.media.MediaPlayer
import com.example.radio.RadioApp
import javax.inject.Inject

inline fun <T> inject(crossinline block: Injector.() -> T): Lazy<T> = lazy { Injector().block() }

class Injector {

    @Inject
    lateinit var mediaPlayer: MediaPlayer

    init {
        RadioApp.app.daggerComponent.inject(this)
    }
}