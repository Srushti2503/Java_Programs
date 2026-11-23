//Convert Employee List into Map and Handle Duplicate Keys
package Java8.EmployeeBasedCodes.Advance;
import java.util.*;
import java.util.stream.Collectors;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class EmpListToMap {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Employee> result = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getDepartment,
                        employee -> employee,
                        (emp1, emp2) ->
                                emp1.getSalary() > emp2.getSalary() ? emp1 : emp2
                ));

        result.forEach((department, employee) -> {
            System.out.println(department + " : " + employee);
        });
    }
}
