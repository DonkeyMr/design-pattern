package com.pattern.memento.white_box;

public class Memeto {

    private String state;

    public Memeto(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
