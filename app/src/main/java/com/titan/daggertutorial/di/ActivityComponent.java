package com.titan.daggertutorial.di;

import com.titan.daggertutorial.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    @Subcomponent.Factory
    interface  Factory {

        ActivityComponent create(@BindsInstance @Named("horsePower")  int horsePower,
                                 @BindsInstance @Named("engineCapacity") int engineCapacity);
    }

}
