package com.principles.OpenClosedPrinciple;

/**
 * 1. @ClassDescription: 自定义皮肤类
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 16:48
 */
public class PrivateSkin extends AbstractSkin{

    @Override
    public void display() {
        System.out.println("个性化皮肤类");
    }
}
