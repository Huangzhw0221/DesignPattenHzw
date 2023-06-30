package com.principles.LiskovSubstitutionPrinciple.before;

/**
 * 1. @ClassDescription: 正方形类，重写设置长宽的方法
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 17:13
 */
public class Square extends Rectangle {

    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
}
