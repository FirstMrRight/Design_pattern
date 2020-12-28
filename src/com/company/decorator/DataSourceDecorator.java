package com.company.decorator;

import java.util.Date;

/**
 * @author Liutx
 * @date 2020/12/27 13:48
 * @Description 抽象基础装饰(被装饰者)
 */
public class DataSourceDecorator implements DataSource{
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
