package com.qiushui.chainofresponsibilitypattern;


/**
 * 总经理
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(this.name + ": " + request.getRequestContent() + "数量 " + request.getNumber() + " 被批准");
        } else if (request.getRequestType().equals("加薪")) {
            if (request.getNumber() <= 500) {
                System.out.println(this.name + ": " + request.getRequestContent() + "数量 " + request.getNumber() + " 被批准");
            } else {
                System.out.println(this.name + ": " + request.getRequestContent() + "数量 " + request.getNumber() + " 再说吧");
            }
        } else {
            System.out.println("召开董事会");
        }
    }

}
