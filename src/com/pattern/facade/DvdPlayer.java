package com.pattern.facade;

public class DvdPlayer {

    public void on() {
        System.out.println("DvdPlayer is on");
    }

    public void play(String movie) {
        System.out.println("DvdPlayer is play ：" + movie);
    }

    public void off() {
        System.out.println("DvdPlayer is off");
    }
}
