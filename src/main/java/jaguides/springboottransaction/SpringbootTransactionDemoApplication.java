package jaguides.springboottransaction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

//@EnableTransactionManagement // not neccassary since we use spring boot application,we use for spring frame work

@SpringBootApplication
public class SpringbootTransactionDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactionDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("############# WELCOME TO THE ORDER SERVICE #############");
		System.out.println(" ....... WHAT SERVICE ARE YOU INQUIRING ......");
		System.out.println("............HERE YOU CAN GET ALL OF YOUR SERVICE.........");
		System.out.println("............YOU CAN UPDATE YOUR EXISTING ORDER..........");
		System.out.println("............CREATE A NEW ORDER.........");
		System.out.println("............DELETE ANY UNSATISFIED ORDER.........");

	}
}
