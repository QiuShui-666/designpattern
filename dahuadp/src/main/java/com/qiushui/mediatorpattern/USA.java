package com.qiushui.mediatorpattern;

public class USA extends Country{

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        System.out.println("USA send message: " + message);
        mediator.declare(message, this);
    }

    public void receive(String message) {
        System.out.println("USA receive message: " + message);
    }

}
