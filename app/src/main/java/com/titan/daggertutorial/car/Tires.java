package com.titan.daggertutorial.car;

import timber.log.Timber;

public class Tires {

    //we don't own this class so we can't annotate it with @Inject

    public void inflate() {
        Timber.d("Tires inflated");
    }
}
