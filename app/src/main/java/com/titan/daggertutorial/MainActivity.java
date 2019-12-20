package com.titan.daggertutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.titan.daggertutorial.car.Car;
import com.titan.daggertutorial.di.ActivityComponent;
import com.titan.daggertutorial.di.DaggerActivityComponent;

import javax.inject.Inject;

import timber.log.Timber;


public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(1200)
                .engineCapacity(40000)
                .appComponent(((App) getApplication()).getAppComponent())
                .build();

        component.inject(this);

        car1.drive();
        Timber.d("car1 left the building");

        car2.drive();
        Timber.d("car2 left the building");
    }
}
