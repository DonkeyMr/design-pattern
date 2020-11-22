package com.pattern.memento.black_box;

public class CareTaker {

    private MemetoIF memeto;


    public MemetoIF retrieveMenento() {
        return this.memeto;
    }

    public void saveMemeto(MemetoIF memeto) {
        this.memeto = memeto;
    }
}
