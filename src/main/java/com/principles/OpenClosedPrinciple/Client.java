package com.principles.OpenClosedPrinciple;

/**
 * 1. @ClassDescription: 测试类
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 16:52
 */
public class Client {
    public static void main(String[] args) {
//        创建皮肤对象
        DefaultSkin defaultSkin = new DefaultSkin();
        PrivateSkin privateSkin = new PrivateSkin();
//        创建输入法对象
        Input input = new Input();
//        设置皮肤
        input.setSkin(defaultSkin);
        input.display();
        input.setSkin(privateSkin);
        input.display();
    }
}
