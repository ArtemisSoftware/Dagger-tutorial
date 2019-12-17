package com.titan.daggertutorial.car;

import timber.log.Timber;

/**
 * we don't own this class so we can't annotate it with @Inject
 */
public class Wheels {

    //we don't own this class so we can't annotate it with @Inject

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        Timber.d("Wheels constructed");
        this.rims = rims;
        this.tires = tires;
    }

}
