package com.qiushui.chainofresponsibilitypattern;


public class Client {

    public static void main(String[] args) {
        CommonManager jinli = new CommonManager("金利");
        Majordomo zongjian = new Majordomo("纵剪");
        GeneralManager zongjingli = new GeneralManager("纵经理");

        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request = new Request();
        request.setNumber(1);
        request.setRequestContent("请假");
        request.setRequestType("请假");
        jinli.requestApplications(request);

        Request request2 = new Request();
        request2.setNumber(4);
        request2.setRequestContent("请假");
        request2.setRequestType("请假");
        jinli.requestApplications(request2);

        Request request3 = new Request();
        request3.setNumber(500);
        request3.setRequestContent("请求加薪");
        request3.setRequestType("加薪");
        jinli.requestApplications(request3);

        Request request4 = new Request();
        request4.setNumber(1000);
        request4.setRequestContent("请求加薪");
        request4.setRequestType("加薪");
        jinli.requestApplications(request4);

    }

}
