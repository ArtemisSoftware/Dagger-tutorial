package com.titan.daggertutorial.di;

import com.titan.daggertutorial.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    void inject(MainActivity mainActivity);
}
