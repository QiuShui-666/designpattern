package com.qiushui.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

// 享元工厂 - 字符计数器工厂
class CharacterCounterFactory {

    private final Map<Character, CharacterCounter> counterCache = new HashMap<>();

    public CharacterCounter getOrCreateCounter(char character) {
        if (!counterCache.containsKey(character)) {
            CharacterCounter counter = new ConcreteCharacterCounter();
            counterCache.put(character, counter);
            return counter;
        } else {
            return counterCache.get(character);
        }
    }

}
