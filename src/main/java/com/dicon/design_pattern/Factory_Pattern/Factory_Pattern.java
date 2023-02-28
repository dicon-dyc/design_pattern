package com.dicon.design_pattern.Factory_Pattern;

/**
 * author:dicon
 * date:2023/02/28 19:50
 * func:Factory Pattern是java中最常用的设计模式之一。这种类型的设计模式，
 * 它提供了一种创建对象的最佳方式。
 *
 * 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程
 * 延迟到子类进行。
 * 主要解决：接口选择的问题。
 */

public class Factory_Pattern {

    public static void main(String[] args){


        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle的对象，并调用它的draw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //获取SQUARE的对象，并调用它的draw方法
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

    }
}
