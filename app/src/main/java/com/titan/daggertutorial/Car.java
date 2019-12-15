package com.titan.daggertutorial;

import javax.inject.Inject;

import timber.log.Timber;

public class Car {

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {

        Timber.d("Car constructor");
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Timber.d("Driving...");
    }
}