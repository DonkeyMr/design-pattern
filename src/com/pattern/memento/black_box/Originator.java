package com.pattern.memento.black_box;

public class Originator {

    private String state;


    public void restoreMemeto(MemetoIF memeto) {
        this.state = ((Memeto) memeto).getState();
    }

    public MemetoIF createMemeto() {
        return new Memeto(this.state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }


    private class Memeto implements MemetoIF {

        private  String state;

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
}
