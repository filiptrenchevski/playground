package com.catforce.playground.di.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private HardDisk hardDisk;
    private Ram ram;

    @Autowired
    /**
     * Spring will see this class while running a package scan and will initialize an instance
     * by calling the constructor which is Autowired
     */
    public Computer(HardDisk hardDisk, Ram ram) {
        this.hardDisk = hardDisk;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return String.format("Hard disk of  %s and %s ", hardDisk, ram);
    }
}