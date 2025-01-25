package day6.problem_statement.employee_management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee and PartTimeEmployee to the list
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "ALOK", 350000, 15000);
        fullTimeEmployee.assignDepartment("HR");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "CHETAN", 203000, 40, 200);
        partTimeEmployee.assignDepartment("IT");

        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Process and display details for all employees
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());

            // Using polymorphism to call getDepartmentDetails
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println("-----------------------------------");
        }
    }
}
