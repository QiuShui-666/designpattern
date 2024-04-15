package com.qiushui.builderpattern;

// 具体产品
public class DesktopComputer implements Computer {
    private String cpu;
    private String ram;
    private String hdd;

    public DesktopComputer(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }
}
