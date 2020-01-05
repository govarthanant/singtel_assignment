package com.singtel.assignment;

import com.singtel.assignment.animals.Animals;
import com.singtel.assignment.animals.aquatic.ClownFish;
import com.singtel.assignment.animals.aquatic.Dolphins;
import com.singtel.assignment.animals.aquatic.Fish;
import com.singtel.assignment.animals.aquatic.Shark;
import com.singtel.assignment.animals.birds.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.PostConstruct;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class AssignmentTest {
	private Animals duck, chicken, rooster, parrotWithCat, parrotWithDogs, fish, shark, clownFish, dolphins;

	@PostConstruct
	void prePare() {
		duck = new Duck();
		chicken = new Chicken();
		rooster= new Rooster(RoosterLanguages.Tamil);
		parrotWithCat = new Parrots(ParrotsType.PARROT_WITH_CATS);
		parrotWithDogs = new Parrots(ParrotsType.PARROT_WITH_DOGS);
		fish = new Fish();
		shark = new Shark();
		clownFish = new ClownFish();
		dolphins = new Dolphins();
	}

	@Test
	public void flyTest() {
		Assertions.assertTrue(duck.performFly());
		Assertions.assertFalse(chicken.performFly());
		Assertions.assertFalse(rooster.performFly());
		Assertions.assertTrue(parrotWithCat.performFly());
		Assertions.assertTrue(parrotWithDogs.performFly());
		Assertions.assertFalse(fish.performFly());
		Assertions.assertFalse(shark.performFly());
		Assertions.assertFalse(clownFish.performFly());
		Assertions.assertFalse(dolphins.performFly());

	}
	@Test
	public void walkTest() {
		Assertions.assertTrue(duck.performWalk());
		Assertions.assertTrue(chicken.performWalk());
		Assertions.assertTrue(rooster.performWalk());
		Assertions.assertTrue(parrotWithCat.performWalk());
		Assertions.assertTrue(parrotWithDogs.performWalk());
		Assertions.assertFalse(fish.performWalk());
		Assertions.assertFalse(shark.performWalk());
		Assertions.assertFalse(clownFish.performWalk());
		Assertions.assertFalse(dolphins.performWalk());
	}
	@Test
	public void swimTest() {
		Assertions.assertTrue(duck.performSwim());
		Assertions.assertFalse(chicken.performSwim());
		Assertions.assertFalse(rooster.performSwim());
		Assertions.assertFalse(parrotWithCat.performSwim());
		Assertions.assertFalse(parrotWithDogs.performSwim());
		Assertions.assertTrue(fish.performSwim());
		Assertions.assertTrue(shark.performSwim());
		Assertions.assertTrue(clownFish.performSwim());
		Assertions.assertTrue(dolphins.performSwim());
	}
	@Test
	public void singTest() {
		Assertions.assertTrue(duck.performSing());
		Assertions.assertTrue(chicken.performSing());
		Assertions.assertTrue(rooster.performSing());
		Assertions.assertTrue(parrotWithCat.performSing());
		Assertions.assertTrue(parrotWithDogs.performSing());
		Assertions.assertFalse(fish.performSing());
		Assertions.assertFalse(shark.performSing());
		Assertions.assertFalse(clownFish.performSing());
		Assertions.assertFalse(dolphins.performSing());
	}



}
