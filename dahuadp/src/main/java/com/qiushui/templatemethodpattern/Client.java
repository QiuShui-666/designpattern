package com.qiushui.templatemethodpattern;

// 客户端
public class Client {

    public static void main(String[] args) {
        TeaMaker greenTeaMaker = new GreenTeaMaker();
        greenTeaMaker.makeTea();

        TeaMaker blackTeaMaker = new BlackTeaMaker();
        blackTeaMaker.makeTea();
    }

}
