package com.company.abstractFactory;

/**
 * @author Liutx
 * @date 2020/12/8 22:25
 * @Description
 */
public class MagicFactory extends Abstractory {

    @Override
    Food createFood() {
        return new MagicBeans();
    }
}
