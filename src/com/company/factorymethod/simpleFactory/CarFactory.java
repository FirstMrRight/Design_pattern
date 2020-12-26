package com.company.factorymethod.simpleFactory;

import com.company.factorymethod.Car;

/**
 * @author Liutx
 * @date 2020/11/30 21:50
 * @Description
 */
public class CarFactory {

    public Car createCar() {
        //日志框架
        System.out.println("a car created!");
        return new Car();
    }
}
