package com.titan.daggertutorial;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims(){
        Timber.d("Providing Rims...");
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        Timber.d("Providing Tires...");
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires ){
        Timber.d("Providing Wheels...");
        return new Wheels(rims, tires);
    }
}
