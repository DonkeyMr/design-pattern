package com.pattern.command.component;

import sun.util.resources.cldr.lag.LocaleNames_lag;

public class Stereo {

    String location;

    public Stereo() {
    }

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo is on");
    }

    public void off() {
        System.out.println(location + " Stereo is off");
    }

    public void setCD() {
        System.out.println( location + " Stereo is setCD");
    }

    public void setDVD() {
        System.out.println(location + " Stereo is setDVD");
    }

    public void setRadio() {
        System.out.println(location + " Stereo is setRadio");
    }

    public void setVolume(int volumn) {
        System.out.println(location + " Stereo is setVolume " + volumn);
    }
}
