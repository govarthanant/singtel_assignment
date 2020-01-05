package com.singtel.assignment;

import com.singtel.assignment.animals.Animals;
import com.singtel.assignment.animals.birds.Duck;
import com.singtel.assignment.animals.birds.Rooster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingtelAssignmentApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SingtelAssignmentApplication.class, args);

		Animals duck = new Duck();
		duck.performFly();

		Animals rooster = new Rooster();
		rooster.performSing();
		rooster.performWalk();
	}

}
