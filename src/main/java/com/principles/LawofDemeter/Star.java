package com.principles.LawofDemeter;

/**
 * 明星类
 */
public class Star {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
