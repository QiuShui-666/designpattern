package com.qiushui.prototypepattern;

// 具体原型A
public class ConcretePrototypeA implements Prototype {
    private String attribute;

    public ConcretePrototypeA(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeA(attribute);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "attribute='" + attribute + '\'' +
                '}';
    }
}
