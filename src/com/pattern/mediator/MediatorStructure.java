package com.pattern.mediator;

public class MediatorStructure extends Mediator {

    private HouseOwner houseOwner;
    private Tenant tenant;

    @Override
    public void constact(String message, People people) {
        // 如果是房主，则租房者获得信息
        if (people == houseOwner) {
            tenant.getMessage(message);
        } else {
            // 如果是租房者，则房主获得信息
            houseOwner.getMessage(message);
        }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
