package com.pattern.memento.white_box;

public class Caretaker {

    private Memeto memeto;

    /**
     * 备忘录的取值方法
     */
    public Memeto retrieveMenento() {
        return this.memeto;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemeto(Memeto memeto) {
        this.memeto = memeto;
    }
}
