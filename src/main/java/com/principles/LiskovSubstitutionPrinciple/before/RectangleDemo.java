package com.principles.LiskovSubstitutionPrinciple.before;

/**
 * 1. @ClassDescription: 测试类
 * 测试类中有一个扩宽方法，对于长方形是生效的，但是对于正方形会产生死循环，那么这就不符合里氏替换原则
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 17:22
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle r = new Rectangle();
        //设置长和宽
        r.setLength(20);
        r.setWidth(10);
        //调用resize方法进行扩宽
        resize(r);
        printLengthAndWidth(r);

        System.out.println("==================");
        //创建正方形对象
        Square s = new Square();
        //设置长和宽
        s.setLength(10);
        //调用resize方法进行扩宽，出现死循环
        resize(s);
        printLengthAndWidth(s);
    }
    // 扩宽方法
    public static void resize(Rectangle rectangle){
        //判断宽如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
