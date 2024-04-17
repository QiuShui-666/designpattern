package com.qiushui.interpreterpattern;

import java.util.HashMap;
import java.util.Map;

// 环境角色
public class Context {
    private final Map<String, Integer> variables = new HashMap<>();

    public void setVariable(String name, int value) {
        variables.put(name, value);
    }

    public int getVariableValue(String name) {
        return variables.getOrDefault(name, 0);
    }
}
