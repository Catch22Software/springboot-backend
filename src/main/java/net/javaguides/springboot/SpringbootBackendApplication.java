package net.javaguides.springboot;

import net.javaguides.springboot.entity.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder()
				.firstName("Ramesh")
				.lastName("Fadatare")
				.email("ramesh@gmail.com")
				.build();
		Employee employee2 = Employee.builder()
				.firstName("James")
				.lastName("Mills")
				.email("mr.james.mills2018@gmail.com")
				.build();
		Employee employee3 = Employee.builder()
				.firstName("Vennessa")
				.lastName("Mills")
				.email("catch22software@gmail.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);

	}
}
