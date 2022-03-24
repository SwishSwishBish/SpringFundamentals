package com.sena;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/employee")
@ApiOperation(value = "/employee", tags = "Employee Profile API")
public class EmployeeProfileAPI {
    List<Employee> employees = Arrays.asList(
            new Employee(12345L, "John", "Electrical", 23823456788L),
            new Employee(22345L, "San", "Computer", 33023456788L),
            new Employee(32345L, "Jack", "Electronics", 43023456788L),
            new Employee(42345L, "Mark", "Mechanical", 53823456788L)
    );


    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "SUCCES", response = Employee.class),
            @ApiResponse(code = 401, message = "UNAUTHORIZES!", response = ErrorResponse.class),
            @ApiResponse(code = 403, message = "FORBIDDEN!", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "NOT FOUND", response = ErrorResponse.class)
    }
    )
    @ApiOperation(value = "Fetch All Employees", response = Iterable.class)
    @GetMapping(value = "/fletch/all")
    public List<Employee> fletchAllEmployees() {
        return employees;
    }

    @ApiOperation(value = "Fetch Employee by Name", response = Employee.class)
    @GetMapping(value = "/fetch/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee fetchEmployeeByName(@ApiParam(value = "Employee Name") @PathVariable(value = "name") String name) {
        return employees.stream().filter(item -> item.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    @ApiOperation(value = "Fetch Employee by Department", response = Employee.class)
    @GetMapping(value = "/fetch/{department}")
    public List<Employee> fetchEmployeeByDepartment(@ApiParam(value = "Department Name", required = true) @PathVariable(value = "department") String department) {
        return employees.stream().filter(i -> i.getDepartment().equalsIgnoreCase(department)).collect(Collectors.toList());
    }

    @ApiOperation(value = "Insert Employee Record", response = Employee.class)
    @PostMapping
    public Employee insertEmployee(@ApiParam(value = "Employee") @RequestBody Employee employee) {
        return employee;
    }

    @ApiOperation(value = "Update an Employee", response = Employee.class)
    @PutMapping
    public Employee updateEmployee(@ApiParam(value = "Employee") @RequestBody Employee employee) {
        return employee;
    }

    @ApiOperation(value = "Delete an Employee", response = Employee.class)
    @DeleteMapping
    public Employee deleteEmployee(@ApiParam(value = "Employee") @RequestBody Employee employee) {
        return employee;
    }

    @ApiOperation(value = "Partial Update a specific Student in the System", response = Employee.class)
    @PatchMapping
    public Object patchEmployee(@ApiParam(value = "Employee") @RequestBody Map<String, Object> partialUpdate) {
        return partialUpdate;
    }
}
