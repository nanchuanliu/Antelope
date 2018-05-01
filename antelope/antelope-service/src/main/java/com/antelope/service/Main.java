package com.antelope.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: LZW
 * Date: 2018-05-01
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "antelope-service.xml" });
        context.start();

        System.out.println("输入任意按键退出 ~ ");
        System.in.read();
        context.close();
    }
}
