package com.qiushui.flyweightpattern;

// 享元接口
interface CharacterCounter {

    void count(char character);

    int getCount(char character);

}
