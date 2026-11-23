//Find Lowest-Paid Employee in Each Department
package Java8.EmployeeBasedCodes.Intermediate;
import java.util.*;
import java.util.stream.Collectors;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class LowestPaidEmpByDept {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Optional<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.minBy(
                                Comparator.comparingDouble(Employee::getSalary)
                        )
                ));

        result.forEach((department, employee) -> {
            System.out.println(department + " : " + employee.get());
        });
    }
}
