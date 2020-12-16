package com.wxz.edu.demo04;

/**
 * @TOOLS : Intellij IDEA
 * @Author : Wu XianZhi
 * @Date : 2020/12/16
 * @Time : 21:56
 * @Version : 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 算术运算符
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));
    }
}