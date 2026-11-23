//Join all employee names using commas
package Java8.EmployeeBasedCodes.Begineer;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

import java.util.*;
import java.util.stream.Collectors;

public class JoinNamesWithCommas {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        String names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));

        System.out.println(names);
    }
}
