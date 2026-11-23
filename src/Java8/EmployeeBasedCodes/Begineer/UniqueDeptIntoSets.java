//Collect unique departments into a Set
package Java8.EmployeeBasedCodes.Begineer;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueDeptIntoSets {
    static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        Set<String> departments = employees.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());

        System.out.println(departments);
    }
}
