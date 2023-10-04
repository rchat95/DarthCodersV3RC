package net.chil.springboot.repository;

import net.chil.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//JPA rep provides CRUD methods to perform CRUD operations
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //all crud database methods

}
