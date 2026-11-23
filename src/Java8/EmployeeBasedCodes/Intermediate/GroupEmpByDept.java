//Group Employees by Department
package Java8.EmployeeBasedCodes.Intermediate;

import java.util.*;
import java.util.stream.Collectors;

import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class GroupEmpByDept {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, List<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        result.forEach((department, empList) -> {
            System.out.println(department + " : " + empList);
        });
    }
}
