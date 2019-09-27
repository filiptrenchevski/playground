package com.catforce.playground.di;

import com.catforce.playground.di.domain.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {


        Computer quantumcomputer = getComputerFromJavaConfig();

        System.out.println("We produced a super computer with  " + quantumcomputer);
    }

    private static Computer getComputerFromJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        return context.getBean(Computer.class);
    }
}