package com.isen.le.dubbo.server;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Isen
 * @date 2019/1/24 15:35
 * @since 1.0
 */
public class Application {
    private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/spring/*.xml", "config/dubbo/*.xml");
        context.start();
        LOGGER.info("dubbo-server启动成功...");
        System.in.read();
    }
}
