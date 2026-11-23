//Separate Employees Whose Salary Is Greater Than 50000 and Those Whose Salary Is Not
package Java8.EmployeeBasedCodes.Intermediate;
import java.util.*;
import java.util.stream.Collectors;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class PartitionEmpBySalary {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<Boolean, List<Employee>> result = employees.stream()
                .collect(Collectors.partitioningBy(
                        employee -> employee.getSalary() > 50000
                ));

        System.out.println("Employees having salary greater than 50000:");

        result.get(true).forEach(System.out::println);

        System.out.println("\nEmployees having salary less than or equal to 50000:");

        result.get(false).forEach(System.out::println);
    }
}
