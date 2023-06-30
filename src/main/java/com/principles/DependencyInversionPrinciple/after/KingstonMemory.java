package com.principles.DependencyInversionPrinciple.after;

/**
 * 金士顿内存条类
 */
public class KingstonMemory implements Memory {

    public void save() {
        System.out.println("使用金士顿内存条");
    }
}
