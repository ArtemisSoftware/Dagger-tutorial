package com.titan.daggertutorial.car;

import com.titan.daggertutorial.di.PerActivity;

import javax.inject.Inject;

import timber.log.Timber;

@PerActivity
public class Car {

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {

        this.driver = driver;
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
        Timber.d("Driver " + this.driver + " is driving " + this);
    }
}
