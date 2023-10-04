package net.chil.springboot;

import net.chil.springboot.model.Employee;
import net.chil.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	// inject employee repository
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstName("Anubha")
				.lastName("Bhaik")
				.email("anubhab@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Try")
				.lastName("Name")
				.email("TN@hotmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("Apoorva")
				.lastName("J")
				.email("AJ@gmail.com")
				.build();
		Employee employee4 = Employee.builder()
				.firstName("Aastha")
				.lastName("Bhaik")
				.email("aasthab@yahoo.co.in")
				.build();
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);


	}
}
