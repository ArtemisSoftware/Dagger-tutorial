package com.titan.daggertutorial;

import android.app.Application;

import com.titan.daggertutorial.di.ActivityComponent;
import com.titan.daggertutorial.di.AppComponent;
import com.titan.daggertutorial.di.DaggerAppComponent;

import timber.log.Timber;

public class App extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        //if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        //} else {
        //    Timber.plant(new ReleaseTree());
        //}

        component = DaggerAppComponent.create();
        Timber.d("Created app component");
    }

    public AppComponent getAppComponent(){
        return component;
    }
}