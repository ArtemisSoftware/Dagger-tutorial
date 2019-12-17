package com.titan.daggertutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.titan.daggertutorial.car.Car;
import com.titan.daggertutorial.di.CarComponent;
import com.titan.daggertutorial.di.DaggerCarComponent;
import com.titan.daggertutorial.di.DieselEngineModule;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Car carCompent = DaggerCarComponent.builder()
/*
        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();
*/


        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this);
        car1.drive();
        car2.drive();

    }
}
