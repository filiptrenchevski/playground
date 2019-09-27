package com.catforce.playground.di;


import com.catforce.playground.di.domain.HardDisk;
import com.catforce.playground.di.domain.Ram;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.DoubleSummaryStatistics;

@Configuration
//Configuration: tells Spring that this is where the beans are defined, can be added to multiple classes
@ComponentScan
public class Config {

    @Bean
    //Bean is used on a method to actually define the object/bean
    public HardDisk hardDisk() {
        return new HardDisk("500 GB" , 1);
    }

    @Bean
    public Ram ram() {
        return new Ram("16 GB of ram memory");
    }
    
}
