package com.company.singleton;

/**
 * @author Liutx
 * @date 2020/11/16 21:31
 * @Description
 */

/**
 * 单例模式
 *
 * @author Liu-PC
 */
public class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    /**
     * 构造方法是private,其他类无法new，
     * 所以其他类在试用该类的实例时，只能通过getInstance()来获取
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void s() {
        System.out.println("s");
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
