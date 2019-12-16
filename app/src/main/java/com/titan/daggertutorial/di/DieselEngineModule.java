package com.titan.daggertutorial.di;

import com.titan.daggertutorial.car.DieselEngine;
import com.titan.daggertutorial.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine BindEngine(DieselEngine engine);
}
