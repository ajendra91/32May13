package com.example.CloudTask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	/*@Bean
	public Demo fun(){
		return new Demo();
	}

	class Demo implements CommandLineRunner{


		@Override
		public void run(String... args) throws Exception {

			System.out.println("hello task");
		}
	}*/

}
