package com.pattern.flyweight.composite;

/**
 * @author liupeng
 * @date 2020/11/12
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * 内蕴状态
     */
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        System.out.println("内蕴状态= " + this.intrinsicState);
        System.out.println("外蕴状态= " + state);
    }
}
