package com.wxz.edu.demo01;

/**
 * @TOOLS : Intellij IDEA
 * @Author : Wu XianZhi
 * @Date : 2020/12/15
 * @Time : 22:25
 * @Version : 1.0
 */
public class EmployeeTest {
    public void main(String[] args) {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}