package com.singtel.assignment;

import com.singtel.assignment.animals.Animals;
import com.singtel.assignment.animals.aquatic.ClownFish;
import com.singtel.assignment.animals.aquatic.Dolphins;
import com.singtel.assignment.animals.aquatic.Fish;
import com.singtel.assignment.animals.aquatic.Shark;
import com.singtel.assignment.animals.birds.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Slf4j
public class SingtelAssignmentApplication {

	public static void main(String[] args) {
		Animals[] animals = new Animals[]{
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrots(ParrotsType.PARROT_WITH_CATS),
				new Parrots(ParrotsType.PARROT_WITH_DOGS),
				new Parrots(ParrotsType.PARROT_WITH_ROOSTER),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphins()
		};

		Map<String, Integer> behaviourMap = getBehavioursCount(animals);
		log.info(" :::::::::: Count Result :::::::::::::");
		behaviourMap.forEach((behaviour, count) ->
				log.info(behaviour + " " + count));

	}

	private static Map<String, Integer> getBehavioursCount(Animals[] animals) {

		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;
		for (Animals animal : animals){
			if (animal.performFly())
				flyCount = flyCount + 1;
			if (animal.performWalk())
				walkCount = walkCount + 1;
			if (animal.performSing())
				singCount = singCount + 1;
			if (animal.performSwim())
				swimCount = swimCount + 1;
		}

		Map<String, Integer> behaviourMap = new HashMap<>();
		behaviourMap.put("fly", flyCount);
		behaviourMap.put("walk", walkCount);
		behaviourMap.put("sing", singCount);
		behaviourMap.put("swim", swimCount);
		return behaviourMap;
	}

}
