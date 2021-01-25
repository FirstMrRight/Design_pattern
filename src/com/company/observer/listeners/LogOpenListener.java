package com.company.observer.listeners;

import java.io.File;

/**
 * @author Liutx
 * @date 2021/1/25 22:43
 * @Description 具体订阅者2
 */
public class LogOpenListener implements EventListener{
    private File log;


    public LogOpenListener(File log) {
        this.log = log;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
