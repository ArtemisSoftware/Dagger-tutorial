package com.titan.daggertutorial;

import dagger.Component;

@Component
public interface CarComponent {

    void inject(MainActivity mainActivity);
}
