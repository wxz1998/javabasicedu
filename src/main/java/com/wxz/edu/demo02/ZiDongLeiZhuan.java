package com.wxz.edu.demo02;

/**
 * @TOOLS : Intellij IDEA
 * @Author : Wu XianZhi
 * @Date : 2020/12/16
 * @Time : 21:38
 * @Version : 1.0
 */
public class ZiDongLeiZhuan {
    public static void main(String[] args) {
        char c1 = 'a';
        //定义一个char类型
        int i1 = c1;
        //char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';
        //定义一个char类型
        int i2 = c2 + 1;
        //char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + i2);
    }
}