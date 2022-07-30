package com.vishnevskiypro.daggerexperiments

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainApp : Application(){
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        appComponent = DaggerAppComponent.create()
        super.onCreate()
    }

}

val Context.appComponent: AppComponent
get() = when(this){
    is MainApp -> appComponent
    else -> this.applicationContext.appComponent
}


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appComponent.inject(this)



    }
}