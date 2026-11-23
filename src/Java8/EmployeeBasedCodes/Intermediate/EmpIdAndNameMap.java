//Create a Map Containing Employee ID as Key and Employee Name as Value
package Java8.EmployeeBasedCodes.Intermediate;
import java.util.*;
import java.util.stream.Collectors;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class EmpIdAndNameMap {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<Integer, String> result = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName
                ));

        System.out.println(result);
    }
}
