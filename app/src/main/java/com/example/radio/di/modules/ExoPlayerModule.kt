package com.example.radio.di.modules

import android.content.Context
import com.example.radio.utils.MediaPlayer

import com.example.radio.utils.MediaPlayerImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ExoPlayerModule {

    @Provides
    @Singleton
    fun provideExoPlayer(context: Context): MediaPlayer {
        return MediaPlayerImpl(context)
    }
}