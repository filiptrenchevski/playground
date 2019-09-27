package com.catforce.playground.di.domain;

public class Ram {
    private String type;

    public Ram(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s", type);
    }
}