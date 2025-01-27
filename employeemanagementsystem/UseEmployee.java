package com.encapsulationandpolymorphism.employeemanagementsystem;

public class UseEmployee {
    public static void main(String[] args) {
        Employee emp;
        emp = new FullTimeEmployee(102000.00,101,"Niketa","IT",34000);
        emp.displayDetails();
        emp.calculateSalary();

        System.out.println();
        emp = new PartTimeEmployee(25000,102,"Sweetu","IT",4,40);
        emp.displayDetails();
        emp.calculateSalary();
    }
}
