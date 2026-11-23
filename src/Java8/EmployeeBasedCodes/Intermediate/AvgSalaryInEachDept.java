//Find Average Salary of Each Department

package Java8.EmployeeBasedCodes.Intermediate;

import java.util.*;
import java.util.stream.Collectors;

import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class AvgSalaryInEachDept {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        result.forEach((department, averageSalary) -> {
            System.out.println(department + " : " + averageSalary);
        });
    }
}
