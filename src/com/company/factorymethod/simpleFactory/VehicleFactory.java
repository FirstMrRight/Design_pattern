package com.company.factorymethod.simpleFactory;

import com.company.factorymethod.Broom;
import com.company.factorymethod.Car;
import com.company.factorymethod.Plane;

/**
 * @author Liutx
 * @date 2020/11/30 21:38
 * @Description
 */
public class VehicleFactory {
    /**
     * 自定义生产过程，前边可以加日志处理、权限处理等
     *
     * @return
     */
    public Car createCar() {
        return new Car();
    }

    public Broom createBroom() {
        //扫帚的权限控制省略
        return new Broom();
    }

    public Plane createPlane() {
        return new Plane();
    }
}
