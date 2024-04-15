package com.qiushui.builderpattern;

// 具体建造者
public class DesktopComputerBuilder implements ComputerBuilder {
    private String cpu;
    private String ram;
    private String hdd;

    @Override
    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setRAM(String ram) {
        this.ram = ram;
    }

    @Override
    public void setHDD(String hdd) {
        this.hdd = hdd;
    }

    @Override
    public Computer build() {
        return new DesktopComputer(cpu, ram, hdd);
    }
}
