package com.singtel.assignment.animals.birds;

import com.singtel.assignment.animals.Animals;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Duck extends Animals {

    public Duck() {

        setWalkBehaviour(() -> {
            log.debug("Duck: I am Walking");
            return true;
        });
        setFlyBehaviour(() -> {
            log.debug("Duck: I am Flying");
            return true;
        });
        setSingBehaviour(() -> {
            log.debug("Quack, quack");
            return true;
        });
        setSwimBehaviour(() -> {
            log.debug("Duck: I am Swimming");
            return true;
        });
    }

}
