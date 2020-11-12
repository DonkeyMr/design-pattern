package com.pattern.flyweight.pure;

/**
 * 抽象享元角色类
 * @author liupeng
 * @date 2020/11/12
 */
public interface Flyweight {

    /**
     *
     * @param state 外蕴状态
      */
    void operation(String state);
}
