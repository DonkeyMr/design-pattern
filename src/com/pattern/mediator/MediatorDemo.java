package com.pattern.mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();

        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("听说你那里有一居室出租");
        houseOwner.constact("是的，你要租吗?");
    }
}
