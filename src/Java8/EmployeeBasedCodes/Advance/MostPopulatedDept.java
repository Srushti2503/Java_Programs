//Find the Most Populated Department
package Java8.EmployeeBasedCodes.Advance;
import java.util.*;
import java.util.stream.Collectors;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class MostPopulatedDept {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

        Optional<Map.Entry<String, Long>> result = deptCount.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        result.ifPresent(entry -> {
            System.out.println("Department: " + entry.getKey());
            System.out.println("Employee Count: " + entry.getValue());
        });
    }
}
