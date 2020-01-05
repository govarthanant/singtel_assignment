package com.singtel.assignment.animals.birds;

import com.singtel.assignment.animals.Animals;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rooster extends Chicken {

    public Rooster (RoosterLanguages roosterLanguages) {
        setSingBehaviour(() -> {
            log.debug("I can sing in {} ", roosterLanguages.getSound());
            log.debug("Cock-a-doodle-doo" );
            return true;
        });
    }
}
