package com.projet6;


import com.projet6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.projet6.Impl.User;
@SpringBootApplication
@EntityScan(basePackages = {"com.projet6.Impl"})
@EnableJpaRepositories(basePackages = {"com.projet6.repository"})
public class Projet6Application {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Projet6Application.class, args);

		}

	/**
	 * Callback used to run the bean.
	 *
	 * @param args incoming main method arguments
	 * @throws Exception on error
	 */

	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("ADMIN");
		user.setPassword("ADMIN");

		//userRepository.save(user);
	}

	}





