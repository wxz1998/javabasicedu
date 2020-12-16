package com.wxz.edu.demo04;

/**
 * @TOOLS : Intellij IDEA
 * @Author : Wu XianZhi
 * @Date : 2020/12/16
 * @Time : 22:24
 * @Version : 1.0
 */
class Vehicle {
}

/**
 * @author wxz18
 */
public class Car extends Vehicle {
    public static void main(String[] args) {
        Vehicle a = new Car();
        boolean result = a instanceof Car;
        System.out.println(result);
    }
}