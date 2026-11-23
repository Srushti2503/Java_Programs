//Collect all employee names into a List.

package Java8.EmployeeBasedCodes.Begineer;

import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

import java.util.*;
import java.util.stream.Collectors;

public class EmpNamesIntoList {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}