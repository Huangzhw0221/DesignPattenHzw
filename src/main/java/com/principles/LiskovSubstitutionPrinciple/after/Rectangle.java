package com.principles.LiskovSubstitutionPrinciple.after;

/**
 * 1. @ClassDescription: 长方形类，不做为父类，同样实现四边形接口
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 17:10
 */
public class Rectangle implements Quadrilateral {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}