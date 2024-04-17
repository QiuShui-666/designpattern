package com.qiushui.mediatorpattern;

public class Irak extends Country {

    public Irak(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    public void declare(String message) {
        System.out.println("Irak send message: " + message);
        mediator.declare(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Irak receive message: " + message);
    }
}
