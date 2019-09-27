package com.catforce.playground.di.domain;

public class HardDisk {
    private String type;
    private int volume;

    public HardDisk(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s %d", type, volume);
    }
}
