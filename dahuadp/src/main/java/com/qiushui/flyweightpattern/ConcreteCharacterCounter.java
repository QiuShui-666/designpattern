package com.qiushui.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

// 具体享元 - 字符计数器
class ConcreteCharacterCounter implements CharacterCounter {

    private final Map<Character, Integer> counts = new HashMap<>();

    @Override
    public void count(char character) {
        counts.put(character, counts.getOrDefault(character, 0) + 1);
    }

    @Override
    public int getCount(char character) {
        return counts.getOrDefault(character, 0);
    }

}
