package com.company.observer;

import com.company.observer.editor.Editor;
import com.company.observer.listeners.EmailNotificationListener;
import com.company.observer.listeners.LogOpenListener;

import java.io.File;

/**
 * @author Liutx
 * @date 2021/1/25 22:44
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open",new LogOpenListener(new File("/path/to/log/file.txt")));
        editor.events.subscribe("open",new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
