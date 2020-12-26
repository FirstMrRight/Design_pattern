package com.company.singleton;

/**
 * @author Liu-PC
 * 解决线程同步，防止反序列化
 */

public enum EFSingleton {
    INSTANCE;

    public void m() {
        System.out.println("业务方法");
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(500);
            new Thread(() -> {
                System.out.println(EFSingleton.INSTANCE.hashCode());
            }).start();
        }
    }
}
