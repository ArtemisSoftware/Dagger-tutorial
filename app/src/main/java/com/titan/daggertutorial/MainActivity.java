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
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Car carCompent = DaggerCarComponent.builder()

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();

        component.inject(this);
        car.drive();
    }
}
