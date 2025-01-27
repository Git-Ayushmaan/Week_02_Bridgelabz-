package com.encapsulationandpolymorphism.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department {

    private String department;
    private int workingHours;
    private double rate;

    public PartTimeEmployee(double baseSalary, int employeeId, String name, String department, int workingHours, double rate) {
        super(baseSalary, employeeId, name);
        this.department = department;
        this.workingHours = workingHours;
        this.rate = rate;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Total salary of employee is: " + (getBaseSalary() + (workingHours * rate)));
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Extra salary is: " + (workingHours * rate));
        System.out.println(getDepartmentDetails());
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department" + department;
    }
}
