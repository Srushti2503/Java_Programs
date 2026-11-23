//Calculate avg salary
package Java8.EmployeeBasedCodes.Begineer;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

import java.util.List;

public class CalculateAvgSalary {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println(averageSalary);
    }
}
