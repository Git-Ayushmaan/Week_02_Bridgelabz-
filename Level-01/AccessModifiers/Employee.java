public class Employee {
    public String employeeID; // Public field for employee ID
    protected String department; // Protected field for department
    private double salary; // Private field for salary

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Subclass of Employee
class Manager extends Employee {
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.employeeID = "M123";
        manager.department = "Finance";
        manager.displayDetails();
    }

  
}
