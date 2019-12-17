package com.titan.daggertutorial.car;

import javax.inject.Inject;

import timber.log.Timber;

public class Car {

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {

        this.engine = engine;
        this.wheels = wheels;
        Timber.d("Car constructed");
    }

    @Inject
    public void enableRemote(Remote remote) {

        Timber.d("Enabling the remote...");
        remote.setListener(this);
    }


    public void drive() {
        engine.start();
        Timber.d("Driving...");
    }
}
