package com.titan.daggertutorial.car;

import javax.inject.Inject;

import timber.log.Timber;

public class DieselEngine implements Engine {

    @Inject
    public DieselEngine(){
        Timber.d("Diesel engine constructor");
    }

    @Override
    public void start() {
        Timber.d("Diesel engine started");
    }
}
