package com.titan.daggertutorial.di;

import com.titan.daggertutorial.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory{

        AppComponent create(DriverModule driverModule);
    }
}
