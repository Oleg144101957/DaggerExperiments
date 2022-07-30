package com.vishnevskiypro.daggerexperiments

import javax.inject.Inject


class Processor{
    override fun toString(): String {
        return "AB2021"
    }
}

class Motherboard{
    override fun toString(): String {
        return "X7 3000"
    }
}

class RAM{
    override fun toString(): String {
        return "16 GB"
    }
}

data class Computer(
    val processor: Processor,
    val motherboard: Motherboard,
    val ram: RAM
    )



fun main(){

    val appComponent: AppComponent = DaggerAppComponent.create()
    println(appComponent.computer)



}