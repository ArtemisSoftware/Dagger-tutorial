package com.titan.daggertutorial.di;

import com.titan.daggertutorial.car.Engine;
import com.titan.daggertutorial.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine BindEngine(PetrolEngine engine);
}
