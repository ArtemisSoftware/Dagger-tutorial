package com.titan.daggertutorial;

import javax.inject.Inject;

import timber.log.Timber;

public class Remote {

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        Timber.d("Remote connected");
    }
}
