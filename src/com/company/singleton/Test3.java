package com.company.singleton;

/**
 * @author Liutx
 * @date 2020/11/17 21:42
 * @Description 优点：如果只加载Test3的话，Test3的唯一实例是不会被初始化的，
 * 内部的静态内部类在加载时是不会被加载的，只有在调用getInstance时才会被加载
 * JVM保证线程安全，Test3Holder只被加载一次
 */
public class Test3 {
    private Test3() {
    }

    /**
     * 静态内部类初始化外部类的对象
     */
    private static class Test3Holder {
        private final static Test3 INSTANCE = new Test3();
    }

    public static Test3 getInstance() {
        return Test3Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Test3.getInstance().hashCode());
            }).start();
        }
    }
}
