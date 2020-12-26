package com.company.singleton;


/**
 * @author Liutx
 * @date 2020/11/17 20:57
 * @Description 按需初始化，但是多线程会有线程安全问题
 */
public class LazyLoading {
    private static LazyLoading INSTANCE;

    private LazyLoading() {
    }

    /**
     * 双重检查
     */
    private static synchronized LazyLoading getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyLoading.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new LazyLoading();
                }
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                System.out.println(LazyLoading.getInstance().hashCode());
            }).start();
        }
    }
}
