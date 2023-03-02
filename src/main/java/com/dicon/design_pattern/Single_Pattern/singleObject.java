package com.dicon.design_pattern.Single_Pattern;

public class singleObject {

    private static singleObject singleObject = new singleObject();

    private singleObject(){};

    public static singleObject getSingleObject(){
        return singleObject;
    }

    public void sendMsg(){
        System.out.println("hello");
    }
}
