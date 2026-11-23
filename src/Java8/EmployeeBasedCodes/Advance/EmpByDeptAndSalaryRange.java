//Group Employees by Department and Then by Salary Range
package Java8.EmployeeBasedCodes.Advance;
import java.util.*;
import java.util.stream.Collectors;
import Java8.EmployeeBasedCodes.Common.Employee;
import Java8.EmployeeBasedCodes.Common.EmployeeData;

public class EmpByDeptAndSalaryRange {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Map<String, List<Employee>>> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.groupingBy(employee -> {

                            if (employee.getSalary() <= 40000) {
                                return "Low";
                            } else if (employee.getSalary() <= 50000) {
                                return "Medium";
                            } else {
                                return "High";
                            }

                        })
                ));

        result.forEach((department, salaryMap) -> {

            System.out.println("\nDepartment: " + department);

            salaryMap.forEach((range, empList) -> {
                System.out.println(range + " : " + empList);
            });

        });
    }
}

