package com.qiushui.flyweightpattern;

// 客户端代码
public class Client {

    public static void main(String[] args) {
        String text = "Sample text for character counting using the Flyweight pattern.";

        CharacterCounterFactory factory = new CharacterCounterFactory();

        // 统计文本中每个字符出现的次数
        for (char c : text.toCharArray()) {
            CharacterCounter counter = factory.getOrCreateCounter(c);
            counter.count(c);
        }

        // 输出结果
        System.out.println("Character counts:");
        for (char c : text.toCharArray()) {
            CharacterCounter counter = factory.getOrCreateCounter(c);
            System.out.printf("%c: %d%n", c, counter.getCount(c));
        }
    }

}
