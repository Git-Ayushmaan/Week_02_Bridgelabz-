class Employee{
    // static keyword
    static String companyName;
    static int totalEmployee = 0;
    static void displayTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployee);
    }

    // final keyword and variable
    private String name;
    private final int id;
    private String designation;

    // constructors for using this keyword
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    // method for displating resultthis to initialize productName, price, and quantity in the constr
    void displayEmployee(){
        if(this instanceof Employee) { // instance of keyword
            System.out.println("Employee detail");
            System.out.println("Company name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Employee desination: " + designation);
        }
        else {
            System.out.println("Invalid instance of object.");
        }
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee.companyName = "ABC Corporation";  // initializing static object
        Employee obj = new Employee("Radhe", 2214, "Analyst"); // object initialization.
        obj.displayEmployee(); // displaying result
    }
}
