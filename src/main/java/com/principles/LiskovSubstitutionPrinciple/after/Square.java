package com.principles.LiskovSubstitutionPrinciple.after;

/**
 * 1. @ClassDescription: 正方形类，不继承长方形，实现四边形接口即可
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 17:13
 */
public class Square implements Quadrilateral {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getLength() {
        return side;
    }

    public double getWidth() {
        return side;
    }
}
