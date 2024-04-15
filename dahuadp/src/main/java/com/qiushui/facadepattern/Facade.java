package com.qiushui.facadepattern;

// 外观类
public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
    }

    public void performComplexOperation() {
        subsystemA.operationA1();
        subsystemB.operationB1();
        subsystemA.operationA2();
        subsystemB.operationB2();
    }
}

