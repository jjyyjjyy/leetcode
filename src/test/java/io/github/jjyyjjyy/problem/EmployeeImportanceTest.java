package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Employee;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class EmployeeImportanceTest {

    @Test
    void getImportance() {
        EmployeeImportance employeeImportance = new EmployeeImportance();

        List<Employee> employees = Arrays.asList(
            new Employee(1, 5, Arrays.asList(2, 3)),
            new Employee(2, 3, Collections.emptyList()),
            new Employee(3, 3, Collections.emptyList())
        );

        assertEquals(11, employeeImportance.getImportance(employees, 1));
    }
}
