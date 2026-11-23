//Calculate total salary.
package Java8.EmployeeBasedCodes.Begineer;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

import java.util.*;

public class CalculateTotalSalary {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println(totalSalary);
    }
}
