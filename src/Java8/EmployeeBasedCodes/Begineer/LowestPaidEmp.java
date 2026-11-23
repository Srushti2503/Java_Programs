////Find the lowest-paid employee
package Java8.EmployeeBasedCodes.Begineer;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

import java.util.*;

public class LowestPaidEmp {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        Employee lowestPaid = employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        System.out.println(lowestPaid);
    }
}
