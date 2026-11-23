//Create a common employee data class

package Java8.EmployeeBasedCodes.Common;

import java.util.*;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return Arrays.asList(
                new Employee(1, "Amit", "IT", 50000),
                new Employee(2, "Rahul", "HR", 40000),
                new Employee(3, "Sneha", "IT", 60000),
                new Employee(4, "Priya", "Finance", 45000),
                new Employee(5, "Karan", "HR", 35000),
                new Employee(6, "Neha", "Finance", 55000),
                new Employee(7, "Rohit", "IT", 70000),
                new Employee(8, "Pooja", "Sales", 30000)
        );
    }
}