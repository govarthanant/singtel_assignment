package com.singtel.assignment.animals.aquatic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClownFish extends Fish {
    public static final String colour = "Orange";
    public static final String size = "Small";


    public boolean makeJokes() {
        log.debug("I am a funny fish");
        return true;
    }
}
