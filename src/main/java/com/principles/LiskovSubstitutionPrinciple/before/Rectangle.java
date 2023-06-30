package com.principles.LiskovSubstitutionPrinciple.before;

import lombok.Data;

/**
 * 1. @ClassDescription: 长方形类，作为父类
 * 2. @author: Huang Zhiwei
 * 3. @date: 2023年06月30日 17:10
 */
@Data
public class Rectangle {
    private double length;
    private double width;
}