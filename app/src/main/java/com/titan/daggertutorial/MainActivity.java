package com.titan.daggertutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import dagger.android.DaggerApplication;


public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CarComponent component = DaggerCarComponent.create();
        car = component.getCar();
        car.drive();
    }
}
