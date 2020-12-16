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

        // 自增自减
        int a1 = 3;
        //定义一个变量；
        int b1 = ++a1;
        //自增运算
        int c1 = 3;
        int d1 = --c1;
        //自减运算
        System.out.println("进行自增运算后的值等于" + b1);
        System.out.println("进行自减运算后的值等于" + d1);

        // 关系运算
        int a2 = 10;
        int b2 = 20;
        System.out.println("a == b = " + (a2 == b2));
        System.out.println("a != b = " + (a2 != b2));
        System.out.println("a > b = " + (a2 > b2));
        System.out.println("a < b = " + (a2 < b2));
        System.out.println("b >= a = " + (b2 >= a2));
        System.out.println("b <= a = " + (b2 <= a2));

        // 位运算
        int a3 = 60;
        /* 60 = 0011 1100 */
        int b3 = 13;
        /* 13 = 0000 1101 */
        int c3 = 0;
        c3 = a3 & b3;
        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c3);

        c3 = a3 | b3;
        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c3);

        c3 = a3 ^ b3;
        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c3);

        c3 = ~a3;
        /*-61 = 1100 0011 */
        System.out.println("~a = " + c3);

        c3 = a3 << 2;
        /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c3);

        c3 = a3 >> 2;
        /* 15 = 1111 */
        System.out.println("a >> 2  = " + c3);

        c3 = a3 >>> 2;
        /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c3);

        // 逻辑运算
        boolean a4 = true;
        boolean b4 = false;
        System.out.println("a && b = " + (a4 && b4));
        System.out.println("a || b = " + (a4 || b4));
        System.out.println("!(a && b) = " + !(a4 && b4));
    }
}