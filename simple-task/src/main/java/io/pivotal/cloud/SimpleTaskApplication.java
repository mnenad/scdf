package io.pivotal.cloud;
 
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
 
@SpringBootApplication
@EnableTask
public class SimpleTaskApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(SimpleTaskApplication.class, args);
	}
 
	@Bean
	public CommandLineRunner commandLineRunner() {
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				System.out.println("Executing simple task");
			}
		};
	}
}
