package com.company.observer.listeners;

import java.io.File;

/**
 * @author Liutx
 * @date 2021/1/25 22:41
 * @Description 具体订阅者1
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
