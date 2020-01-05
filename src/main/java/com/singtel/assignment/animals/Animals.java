package com.singtel.assignment.animals;

import com.singtel.assignment.behaviours.FlyBehaviour;
import com.singtel.assignment.behaviours.SingBehaviour;
import com.singtel.assignment.behaviours.SwimBehaviour;
import com.singtel.assignment.behaviours.WalkBehaviour;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
public abstract class Animals {
    private FlyBehaviour flyBehaviour;
    private WalkBehaviour walkBehaviour;
    private SingBehaviour singBehaviour;
    private SwimBehaviour swimBehaviour;


    public boolean performFly() {
        return flyBehaviour !=null && flyBehaviour.fly();
    }

    public boolean performWalk() {
        return walkBehaviour != null && walkBehaviour.walk();
    }

    public boolean performSing() {
        return singBehaviour != null && singBehaviour.sing();
    }

    public boolean performSwim() {
        return swimBehaviour != null && swimBehaviour.swim();
    }

}
