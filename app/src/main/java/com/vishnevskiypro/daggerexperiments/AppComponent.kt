package com.vishnevskiypro.daggerexperiments

import dagger.Component
import dagger.Module
import dagger.Provides


@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)

    val computer: Computer

}

@Module
object AppModule {

    @Provides
    fun provideComputer(
        processor: Processor,
        motherboard: Motherboard,
        ram: RAM

    ) : Computer {
        return Computer(
            processor = processor,
            motherboard = motherboard,
            ram = ram
        )
    }


    @Provides
    fun provideProcessor() : Processor{
        return Processor()
    }

    @Provides
    fun provideMotherboard() : Motherboard{
        return Motherboard()
    }

    @Provides
    fun provideRAM() : RAM{
        return RAM()
    }

}