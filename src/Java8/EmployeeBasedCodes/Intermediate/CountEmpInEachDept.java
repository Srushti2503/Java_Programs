//Count Employees in Each Department


package Java8.EmployeeBasedCodes.Intermediate;

import java.util.*;
import java.util.stream.Collectors;

import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class CountEmpInEachDept {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Long> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

        result.forEach((department, count) -> {
            System.out.println(department + " : " + count);
        });
    }
}
