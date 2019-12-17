package com.titan.daggertutorial.car;

import javax.inject.Inject;

import timber.log.Timber;

public class DieselEngine implements Engine {

    private int horsePower;


    public DieselEngine(int horsePower){

        this.horsePower = horsePower;
        Timber.d("Diesel engine constructor");
    }

    @Override
    public void start() {
        Timber.d("Diesel engine started. Horsepower: " + this.horsePower);
    }
}
