//Find total number of employees
package Java8.EmployeeBasedCodes.Begineer;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

import java.util.*;

public class TotalNoOfEmp {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
        long count = employees.stream()
                .count();

        System.out.println(count);

    }
}
