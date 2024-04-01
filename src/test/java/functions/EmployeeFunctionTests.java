package functions;

import com.ankur.domain.Employee;
import com.ankur.domain.Status;
import com.ankur.functions.EmployeeFunctions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeFunctionTests {

    private EmployeeFunctions employeeFunctions;

    @BeforeEach
    public void setup() {
        employeeFunctions = new EmployeeFunctions();
    }

    @Test
    public void findById() {
        Function<Integer, Employee> findByIdFunction = employeeFunctions.findById();
        Employee employee = findByIdFunction.apply(1);
        assertNotNull(employee);
        assertEquals("ankur", employee.getName());
        assertEquals("frisco", employee.getAddress());
    }

    @Test
    public void all(){
        Supplier<List<Employee>> allFunction = employeeFunctions.all();
        List<Employee> employees = allFunction.get();
        Employee employee1 = employees.get(0);
        assertEquals(1,employee1.getId());
        assertEquals("ankur",employee1.getName());
        assertEquals("frisco",employee1.getAddress());
    }

    @Test
    public void add(){
        Function<Employee, Status> addFunction = employeeFunctions.add();
        Employee mockEmployee = createEmployee();
        Status status = addFunction.apply(mockEmployee);
        assertEquals(Status.SUCCESS,status);

        //cleanup
//        Function<Integer,Status> removeFunction = employeeFunctions.remove();
//        removeFunction.apply(9);
    }

    @Test
    public void remove(){
        Function<Integer,Status> removeFunction = employeeFunctions.remove();
        Status status = removeFunction.apply(2);
        assertEquals(status,Status.SUCCESS);
    }

    private Employee createEmployee(){
        return new Employee(9,"donald","washington");
    }

}
