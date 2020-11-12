package com.pattern.proxy.protect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwerInvocationHandler implements InvocationHandler {

    PersonBean person;

    public NonOwerInvocationHandler(PersonBean personBean) {
        this.person = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       try {
           String methodName = method.getName();
           if (methodName.startsWith("get")) {
               return method.invoke(person, args);
           } else if (methodName.equals("setHotOrNotRating")) {
               return method.invoke(person, args);
           } else if (methodName.startsWith("set")) {
               throw new IllegalAccessException();
           }
       } catch (InvocationTargetException e) {
           e.printStackTrace();
       }
        return null;
    }
}
