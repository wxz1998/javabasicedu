package com.wxz.edu.demo02;

/**
 * @TOOLS : Intellij IDEA
 * @Author : Wu XianZhi
 * @Date : 2020/12/15
 * @Time : 22:21
 * @Version : 1.0
 */
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }
}