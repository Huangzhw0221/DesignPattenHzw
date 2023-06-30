package com.principles.OpenClosedPrinciple;

/**
 * 1. @ClassDescription: 输入法类，该类需要聚合皮肤和display方法
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 16:50
 */
public class Input {
    private AbstractSkin skin;
//    设置皮肤
    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
//    展示方法，调用skin的展示
    public void display(){
        skin.display();
    }
}
