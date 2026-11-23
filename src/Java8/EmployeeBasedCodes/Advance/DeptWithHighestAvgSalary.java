//Find the Department with the Highest Average Salary

package Java8.EmployeeBasedCodes.Advance;
import java.util.*;
import java.util.stream.Collectors;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class DeptWithHighestAvgSalary {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        Optional<Map.Entry<String, Double>> result = avgSalaryByDept
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        result.ifPresent(entry -> {
            System.out.println("Department: " + entry.getKey());
            System.out.println("Average Salary: " + entry.getValue());
        });
    }
}
