package com.pattern.memento.multipule_check;

import sun.text.normalizer.UBiDiProps;

import java.util.ArrayList;
import java.util.List;

public class Originator {

    private List<String> states;
    // 检查点序号
    private int index;

    public Originator() {
        this.states = new ArrayList<>();
        this.index = 0;
    }

    public Memeto createMemeto() {
        return new Memeto(states, index);
    }

    public void restoreMemeto(Memeto memeto) {
        this.states = memeto.getStates();
        this.index = memeto.getIndex();
    }

    public List<String> getStates() {
        return states;
    }

    public void setState(String state) {
        this.states.add(state);
        this.index++;
    }

    public void printStates() {
        System.out.println("当前检查点共有：" + states.size() + "个状态值");
        states.forEach(System.out::println);
    }
}
