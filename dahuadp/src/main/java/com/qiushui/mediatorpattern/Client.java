package com.qiushui.mediatorpattern;

public class Client {

    public static void main(String[] args) {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA USA = new USA(UNSC);
        UNSC.register(USA);

        Irak Irak = new Irak(UNSC);
        UNSC.register(Irak);

        USA.declare("不准研制核武器，否则要发动战争");
        Irak.declare("不准研制核武器，否则要发动战争");
    }

}
