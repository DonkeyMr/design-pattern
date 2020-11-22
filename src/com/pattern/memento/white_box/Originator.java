package com.pattern.memento.white_box;

public class Originator {

    private String state;


    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public Memeto createMemeto() {
        return new Memeto(state);
    }

    /**
     * 将发起人的状态恢复到备忘录对象所记录的状态
     */
    public void restoreMemeto(Memeto memeto) {
        this.state = memeto.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }
}
