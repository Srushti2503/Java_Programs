//Group Employees by Department and Collect Only Unique Employee Names
package Java8.EmployeeBasedCodes.Advance;
import java.util.*;
import java.util.stream.Collectors;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class UniqueEmpNamesByDept {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Set<String>> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName,
                                Collectors.toSet()
                        )
                ));

        result.forEach((department, names) -> {
            System.out.println(department + " : " + names);
        });
    }
}
