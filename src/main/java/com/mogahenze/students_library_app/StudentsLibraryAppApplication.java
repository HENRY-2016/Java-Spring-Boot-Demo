package com.mogahenze.students_library_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mogahenze.students_library_app")
public class StudentsLibraryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsLibraryAppApplication.class, args);
	}

}
