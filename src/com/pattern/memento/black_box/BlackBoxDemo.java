package com.pattern.memento.black_box;

import com.pattern.memento.white_box.Caretaker;
import com.pattern.memento.white_box.Originator;

public class BlackBoxDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        // 改变发起人对象的状态
        originator.setState("On");
        // 创建备忘录对象，并将发起人对象的状态储存起来
        caretaker.saveMemeto(originator.createMemeto());
        // 改变发起人对象的状态
        originator.setState("Off");
        // 恢复发起人对象的状态
        originator.restoreMemeto(caretaker.retrieveMenento());

        // 发起人对象的状态
        System.out.println("发起人当前的状态为：" + originator.getState());
    }
}
