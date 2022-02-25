package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.creatAccount();

        PartTimeMentor pt1 = container.getBean("p1", PartTimeMentor.class);

        PartTimeMentor pt = container.getBean( PartTimeMentor.class);
        pt.creatAccount();

    }

}
