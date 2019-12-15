package com.titan.daggertutorial;

import javax.inject.Inject;

import timber.log.Timber;

public class Engine {

    @Inject
    public Engine() {
        Timber.d("Engine constructor");
    }
}
