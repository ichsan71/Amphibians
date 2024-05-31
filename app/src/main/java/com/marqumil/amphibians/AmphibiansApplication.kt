package com.marqumil.amphibians

import android.app.Application
import com.marqumil.amphibians.data.AppContainer
import com.marqumil.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}