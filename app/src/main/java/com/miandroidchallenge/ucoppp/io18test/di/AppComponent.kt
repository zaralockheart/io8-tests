package com.miandroidchallenge.ucoppp.io18test.di

import android.app.Application
import com.miandroidchallenge.ucoppp.io18test.MainActivity
import com.miandroidchallenge.ucoppp.io18test.modules.ApiModule
import com.miandroidchallenge.ucoppp.io18test.modules.UserModule
import com.miandroidchallenge.ucoppp.io18test.ui.main.MainViewModel
import com.miandroidchallenge.ucoppp.io18test.ui.splash.SplashViewModel
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class, UserModule::class, ApiModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(application: Application)
    fun inject(splashViewModel: SplashViewModel)
    fun inject(mainViewModel: MainViewModel)
}
