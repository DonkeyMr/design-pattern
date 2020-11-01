package com.pattern.proxy.protect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       try {
           String methodName = method.getName();
           if (methodName.startsWith("get")) {
               return method.invoke(person, args);
           } else if (methodName.equals("setHotOrNotRating")) {
               throw new IllegalAccessException();
           } else if (methodName.startsWith("set")) {
               return method.invoke(person, args);
           }
       } catch (InvocationTargetException e) {
           e.printStackTrace();
       }
        return null;
    }
}