package com.company.abstractFactory;

/**
 * @author Liutx
 * @date 2020/12/8 22:22
 * @Description
 */
public class ModernFactory extends Abstractory {


    @Override
    Food createFood() {
        return new Bread();
    }
}
