package com.encapsulationandpolymorphism.employeemanagementsystem;

public abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(double baseSalary, int employeeId, String name) {
        this.baseSalary = baseSalary;
        this.employeeId = employeeId;
        setBaseSalary(baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) this.baseSalary = baseSalary;
        else System.out.println("Invalid action found !!");
    }

    public abstract void calculateSalary();

    public void displayDetails() {
        System.out.println("Base salary of " + name + " with employee id " + employeeId + " is: " + baseSalary);
    }
}
