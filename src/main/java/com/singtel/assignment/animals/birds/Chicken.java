package com.singtel.assignment.animals.birds;

import com.singtel.assignment.animals.Animals;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Chicken extends Animals {

    public Chicken() {
        setFlyBehaviour(() -> {
            log.debug("Sorry, I am a chicken, I cannot fly");
            return false;
        });
        setSingBehaviour(() -> {
            log.debug("Cluck, cluck" );
            return true;
        });
        setWalkBehaviour(() -> {
            log.debug("Chicken: I am Walking");
            return true;
        });
    }



}
