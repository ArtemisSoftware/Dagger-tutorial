package com.titan.daggertutorial.car;

import javax.inject.Inject;
import javax.inject.Named;

import timber.log.Timber;

public class PetrolEngine implements Engine {


    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsePower")int horsePower, @Named("engineCapacity")int engineCapacity){

        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        Timber.d("horsePower: " + horsePower);
        Timber.d("engineCapacity: " + engineCapacity);
        Timber.d("Petrol engine constructed");
    }


    @Override
    public void start() {
        Timber.d("Petrol engine started. Horsepower: " + this.horsePower + " Engine Capacity: " + this.engineCapacity);
    }
}
