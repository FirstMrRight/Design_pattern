package com.company.chain;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Liutx
 * @date 2021/1/6 21:47
 * @Description eg:
 * 一个论坛，需要过滤不良言论，所以说需要针对不同的不良言论类型进行处理
 */
public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:), <script>,欢迎访问 49.232.21.180,大家都是996");


        //条件筛选
        List<Filter> filterList = new ArrayList<>();
        filterList.add(new HTMLFilter());
        filterList.add(new SensitiveFilter());
        filterList.forEach(it -> {
            it.doFilter(msg);
        });

        System.out.println(msg);
    }

}

class Msg {
    String name;
    String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

/**
 * 封装变化，需要根据不同的类型做不同的处理
 */
interface Filter {
    /**
     * 过滤接口
     *
     * @param m
     */
    void doFilter(Msg m);
}

class HTMLFilter implements Filter {

    @Override
    public void doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace('<', '[');
        r = r.replace('>', ']');
        m.setMsg(r);
    }
}

class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replaceAll("996", "955");
        m.setMsg(r);
    }
}