package com.encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department {

    private String department;
    private double fixedSalary;

    public FullTimeEmployee(double baseSalary, int employeeId, String name, String department, double fixedSalary) {
        super(baseSalary, employeeId, name);
        this.department = department;
        this.fixedSalary = fixedSalary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Total salary if the employee is: "+(getBaseSalary() + fixedSalary));
    }

    @Override
    public String getDepartmentDetails() {
        return "Department" + department;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fixed Salary:" + fixedSalary);
        System.out.println(getDepartmentDetails());
    }
}
