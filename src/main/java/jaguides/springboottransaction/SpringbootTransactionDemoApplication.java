package jaguides.springboottransaction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTransactionManagement // not neccassary since we use spring boot application,we use for spring frame work

@SpringBootApplication
public class SpringbootTransactionDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactionDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("............here we go..........");
	}
}
