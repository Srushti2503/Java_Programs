//Find the Second-Highest-Paid Employee
package Java8.EmployeeBasedCodes.Advance;

import java.util.*;
import java.util.stream.Collectors;

import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class SecondHighestPaidEmp {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Optional<Employee> result = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();

        System.out.println(result.orElse(null));
    }
}
