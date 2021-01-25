package com.company.observer.listeners;

import java.io.File;

/**
 * @author Liu-PC
 */
public interface EventListener {
    /**
     * 订阅者的update方法
     * @param eventType
     * @param file
     */
    void update(String eventType, File file);
}
