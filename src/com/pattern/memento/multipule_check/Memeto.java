package com.pattern.memento.multipule_check;

import java.util.ArrayList;
import java.util.List;

public class Memeto {

    private List<String> states;
    private int index;

    public Memeto(List<String> states, int index) {
        // 构建了一个新集合，拷贝状态集合到新的集合中，保证原有集合变化不会影响到我们记录的值
        this.states = new ArrayList<>(states);
        this.index = index;
    }

    public List<String> getStates() {
        return states;
    }

    public int getIndex() {
        return index;
    }
}
