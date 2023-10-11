package net.chil.springboot.controller;

import net.chil.springboot.exception.ResourceNotFoundException;
import net.chil.springboot.model.Employee;
import net.chil.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// will let the class be a SPRING MVC REST controller which will be able to handle web requests
@RequestMapping("/api/employees")
//base path
@CrossOrigin("http://localhost:8081/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee>  getAllEmployees(){
        return employeeRepository.findAll();
    }

    //build create employee Rest API
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        String dumdum = "";
        return employeeRepository.save(employee);
    }
    //build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Employee not exist with id:"+id)
        );
        return ResponseEntity.ok(employee);


    }
    //build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails){
        Employee updateEmployee = employeeRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Employee not exist with id:"+id)
        );

        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmail(employeeDetails.getEmail());

        employeeRepository.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }
    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(
                        ()->new ResourceNotFoundException("Employee not exist with id:"+id)
                );
        employeeRepository.delete(employee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
