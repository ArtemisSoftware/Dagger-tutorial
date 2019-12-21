package com.titan.daggertutorial.car;

import javax.inject.Inject;
import javax.inject.Singleton;

import timber.log.Timber;


/**
 * We don't own this class so we can't annotate it with @Inject
 */
public class Driver {

    String name;
    public Driver(String name){

        this.name = name;
        Timber.d("Driver constructed");
    }
}
