package com.titan.daggertutorial;

import javax.inject.Inject;

import timber.log.Timber;

public class Wheels {

    //we don't own this class so we can't annotate it with @Inject

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        Timber.d("Wheels constructor");
        this.rims = rims;
        this.tires = tires;
    }

}
