package com.company.builder;

import com.company.builder.builders.CarBuilder;
import com.company.builder.builders.CarManualBuilder;
import com.company.builder.cars.Car;
import com.company.builder.cars.Manual;
import com.company.builder.director.Director;

/**
 * @author Liutx
 * @date 2021/1/19 22:19
 * @Description execute Demo
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
