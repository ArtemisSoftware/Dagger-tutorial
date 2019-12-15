package com.titan.daggertutorial;

import javax.inject.Inject;

import timber.log.Timber;

public class Wheels {

    @Inject
    public Wheels() {
        Timber.d("Wheels constructor");
    }
}
