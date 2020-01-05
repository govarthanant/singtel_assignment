package com.singtel.assignment.animals.birds;

import com.singtel.assignment.animals.Animals;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Parrots extends Animals {

    public Parrots (ParrotsType parrotsType) {
        setSingBehaviour(() -> {
            switch (parrotsType) {
                case PARROT_WITH_CATS:
                    log.debug("Meow");
                    return true;
                case PARROT_WITH_DOGS:
                    log.debug("Woof, woof");
                    return true;
                case PARROT_WITH_ROOSTER:
                    log.debug("Cock-a-doodle-doo");
                    return true;
                default:
                    return false;

            }
        });

        setFlyBehaviour(() -> {
            log.debug("Parrot: I am Flying");
            return true;
        });
        setWalkBehaviour(() -> {
            log.debug("Parrot: I am Walking");
            return true;
        });
    }

}
