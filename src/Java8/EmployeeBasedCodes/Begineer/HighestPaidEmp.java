//Find the highest-paid employee
package Java8.EmployeeBasedCodes.Begineer;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

import java.util.*;

public class HighestPaidEmp {
   public static void main(String[] args) {
       List<Employee> employees = EmployeeData.getEmployees();
       Employee highestPaid = employees.stream()
               .max(Comparator.comparingDouble(Employee::getSalary))
               .orElse(null);

       System.out.println(highestPaid);
    }
}
