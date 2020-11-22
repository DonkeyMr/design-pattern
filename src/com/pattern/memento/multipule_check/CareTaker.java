package com.pattern.memento.multipule_check;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private Originator originator;
    private List<Memeto> memetos = new ArrayList<>();
    private int current;

    public CareTaker(Originator originator) {
        this.originator = originator;
        this.current = 0;
    }

    public int createMemeto() {
        Memeto memeto = this.originator.createMemeto();
        this.memetos.add(memeto);
        return this.current++;
    }

    public void restoreMemeto(int index) {
        Memeto memeto = memetos.get(index);
        originator.restoreMemeto(memeto);
    }

    public void removeMemeto(int index) {
        memetos.remove(index);
    }

    public void printAll() {
        for (int i = 0; i < memetos.size(); i++) {
            System.out.println("index i：" + i + memetos.get(i) + " : " + memetos.get(i).getStates());
        }
    }
}
