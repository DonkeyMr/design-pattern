package com.pattern.proxy.protect;

import java.lang.reflect.Proxy;

public class ProtectProxyTest {

    public static void main(String[] args) {
        PersonBean person = new PersonBeanImpl();
        person.setName("Alice");
        person.setHotOrNotRating(7);

        PersonBean ownerProxy = getOwnerProxy(person);
        System.out.println("Name is: " + ownerProxy.getName());
        ownerProxy.setInterests("Bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is: " + ownerProxy.getHotOrNotRating());

        System.out.println(" ");

        PersonBean nonOwnerProxy = getNonOwnerProxy(person);
        System.out.println("Name is: " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("Bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from ono owner proxy");
        System.out.println("Rating is: " + nonOwnerProxy.getHotOrNotRating());
    }

    private static PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwerInvocationHandler(person));
    }

    private static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }


}
