package com.company.factorymethod;

import com.company.factorymethod.simpleFactory.CarFactory;

/**
 * @author Liutx
 * @date 2020/11/30 21:29
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        //老板出行，司机(MoveAble)开不同的交通工具
//        MoveAble moveAble = new Car();
//        moveAble.go();

        //使用工厂方法
        MoveAble moveAbleByCar = new CarFactory().createCar();
        moveAbleByCar.go();

        //使用工厂方法
        MoveAble moveAbleByPlane = new CarFactory().createCar();
        moveAbleByPlane.go();
    }
}
