package com.springsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shekerama on 2017-01-21.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        System.out.println(ctx.getBean(Person.class));
    }
}
