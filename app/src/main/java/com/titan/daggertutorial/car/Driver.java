package com.titan.daggertutorial.car;

import javax.inject.Inject;
import javax.inject.Singleton;

import timber.log.Timber;

@Singleton
public class Driver {

    @Inject
    public Driver(){
        Timber.d("Driver constructed");
    }
}
