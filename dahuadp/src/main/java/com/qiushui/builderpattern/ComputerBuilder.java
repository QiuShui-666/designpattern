package com.qiushui.builderpattern;

// 抽象建造者
public interface ComputerBuilder {
    void setCPU(String cpu);
    void setRAM(String ram);
    void setHDD(String hdd);
    Computer build();
}
