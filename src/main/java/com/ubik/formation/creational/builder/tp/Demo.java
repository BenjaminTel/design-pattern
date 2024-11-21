package com.ubik.formation.creational.builder.tp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car
                .CarBuilder(Car.Model.SUV, Car.Engine.HYBRID, 7)
                .color("Blue")
                .addExtra(new ArrayList<String>(Arrays.asList("GPS", "Toit ouvrant")))
                .build();

        System.out.println(car.displayCar());
    }
}
