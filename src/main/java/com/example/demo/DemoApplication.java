package com.example.demo;

import javax.annotation.PostConstruct;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoApplication {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void testJpaAnnotations() {

		Customer customer = new Customer();
		customer.setFirstName("Test");
		customer.setLastName("Last");
		customer = this.customerRepository.save(customer);

		System.out.println("Count: " + customerRepository.count());
		System.out.println("Customer Created At: " + customer.getCreatedAt());
	}

}
