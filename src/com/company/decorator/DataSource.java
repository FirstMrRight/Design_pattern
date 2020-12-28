package com.company.decorator;

/**
 * @author Liu-PC
 */
public interface DataSource {

    /**
     * 定义写入的功能接口
     * @param data
     */
    void writeData(String data);

    /**
     * 定义读取的方法
     * @return
     */
    String readData();
}
