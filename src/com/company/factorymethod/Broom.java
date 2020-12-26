package com.company.factorymethod;

/**
 * @author Liutx
 * @date 2020/11/30 21:31
 * @Description
 */
public class Broom implements MoveAble{
    @Override
    public void go() {
        //魔法扫帚
        System.out.println("broom is ready...");
    }
}
