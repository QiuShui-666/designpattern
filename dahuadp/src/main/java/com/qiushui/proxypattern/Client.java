package com.qiushui.proxypattern;

// 客户端
public class Client {

    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("large.jpg");
        proxyImage.display(); // 输出：Loading image from disk: large.jpg, Displaying image: large.jpg
        proxyImage.display(); // 输出：Displaying image: large.jpg （已经加载到内存，无需再次加载）
    }

}
