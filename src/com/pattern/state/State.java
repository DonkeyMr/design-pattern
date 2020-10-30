package com.pattern.state;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void trunCrank();

    void dispense();
}
