package com.company.observer.publisher;

import com.company.observer.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Liutx
 * @date 2021/1/25 22:24
 * @Description
 */
public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    /**
     * 事件管理遍历订阅者
     *
     * @param operations
     */
    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    /**
     * 订阅者
     *
     * @param eventTyp
     * @param listener
     */
    public void subscribe(String eventTyp, EventListener listener) {
        List<EventListener> users = listeners.get(eventTyp);
        users.add(listener);
    }


    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }

}
