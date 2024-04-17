package com.qiushui.chainofresponsibilitypattern;


public abstract class Manager {

    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public abstract void requestApplications(Request request);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

}