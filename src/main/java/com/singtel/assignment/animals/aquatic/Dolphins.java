package com.singtel.assignment.animals.aquatic;


import com.singtel.assignment.animals.Animals;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dolphins extends Animals {

    public Dolphins() {
        setSwimBehaviour(() -> {
            log.debug("Dolphin Swimming");
            return true;
        });
    }
}
