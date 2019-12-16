package com.titan.daggertutorial.car;

import javax.inject.Inject;

import timber.log.Timber;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine(){
        Timber.d("Petrol engine constructor");
    }

    @Override
    public void start() {
        Timber.d("Petrol engine started");
    }
}
