package com.titan.daggertutorial.di;

import com.titan.daggertutorial.car.DieselEngine;
import com.titan.daggertutorial.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        Timber.d("Providing Diesel engine...");
        return engine;
    }
}
