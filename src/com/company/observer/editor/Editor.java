package com.company.observer.editor;

import com.company.observer.publisher.EventManager;

import java.io.File;
import java.security.PublicKey;

/**
 * @author Liutx
 * @date 2021/1/25 22:37
 * @Description
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file!=null){
            events.notify("save",file);
        }else {
            throw new Exception("Please open a file first.");
        }
    }
}
