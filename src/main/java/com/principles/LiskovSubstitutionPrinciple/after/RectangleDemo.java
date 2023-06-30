package com.principles.LiskovSubstitutionPrinciple.after;

/**
 * 1. @ClassDescription: 测试类，其中resize方法接收的参数指定了是Rectangle长方形类
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 17:40
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        //调用方法进行扩宽操作
        resize(r);
        printLengthAndWidth(r);

    }
    //扩宽的方法，接收的参数指定了是Rectangle长方形类
    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
