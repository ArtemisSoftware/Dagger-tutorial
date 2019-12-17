package com.titan.daggertutorial.di;

import com.titan.daggertutorial.car.Rims;
import com.titan.daggertutorial.car.Tires;
import com.titan.daggertutorial.car.Wheels;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        Timber.d("Providing Rims...");
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Timber.d("Providing Tires...");
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires ){
        Timber.d("Providing Wheels...");
        return new Wheels(rims, tires);
    }
}
