package com.principles.OpenClosedPrinciple;

/**
 * 1. @ClassDescription: 默认皮肤类
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 16:47
 */
public class DefaultSkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("默认皮肤类");
    }
}
