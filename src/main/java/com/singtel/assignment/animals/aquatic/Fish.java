package com.singtel.assignment.animals.aquatic;

import com.singtel.assignment.animals.Animals;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fish extends Animals {

    public Fish() {
        setFlyBehaviour(() -> {
            log.debug("Fish: I cannot Fly");
            return false;
        });
        setSingBehaviour(() -> {
            log.debug("Fish: I cannot Sing");
            return false;
        });
        setSwimBehaviour(() -> {
            log.debug("I am Swimming");
            return true;
        });
        setWalkBehaviour(() -> {
            log.debug("Fish: I cannot Walk");
            return false;
        });
    }



}
