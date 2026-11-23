//Collect Employee Names Department-Wise Using mapping()
package Java8.EmployeeBasedCodes.Intermediate;
import java.util.*;
import java.util.stream.Collectors;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class EmpNamesByDept {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, List<String>> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName,
                                Collectors.toList()
                        )
                ));

        result.forEach((department, names) -> {
            System.out.println(department + " : " + names);
        });
    }
}
