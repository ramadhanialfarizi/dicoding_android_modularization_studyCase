package com.dicoding.tourismapp

import android.app.Application
import com.dicoding.tourismapp.core.di.*
import com.dicoding.tourismapp.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                listOf(
                    _root_ide_package_.com.dicoding.tourismapp.core.di.databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}