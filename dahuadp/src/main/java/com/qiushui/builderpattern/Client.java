package com.qiushui.builderpattern;

// 客户端
public class Client {
    public static void main(String[] args) {
        ComputerBuilder builder = new DesktopComputerBuilder();
        builder.setCPU("Intel i7");
        builder.setRAM("16GB DDR4");
        builder.setHDD("1TB SSD");

        Computer computer = builder.build();
        System.out.println("CPU: " + computer.getCPU());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("HDD: " + computer.getHDD());
    }
}
