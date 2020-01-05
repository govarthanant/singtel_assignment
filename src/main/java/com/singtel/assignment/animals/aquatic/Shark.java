package com.singtel.assignment.animals.aquatic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Shark extends Fish {
    public final String colour = "Grey";
    public final String size = "Large";


    public boolean eatFish() {
        log.debug("I am a shark, eating fishes");
        return true;
    }
}
