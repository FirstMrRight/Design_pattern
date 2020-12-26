package com.company.abstractFactory;

/**
 * @author Liutx
 * @date 2020/12/8 22:39
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Abstractory mg = new MagicFactory();
        Food mgFood = mg.createFood();
        mgFood.printName();

        System.out.println("======================魔法与现实的分界线=======================");

        Abstractory md = new ModernFactory();
        Food mdFood = md.createFood();
        mdFood.printName();
    }
}
