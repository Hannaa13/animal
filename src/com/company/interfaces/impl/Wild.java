package com.company.interfaces.impl;

import com.company.Animal;
import com.company.interfaces.AnimalInter;
import com.company.interfaces.Predator;

public class Wild extends Animal implements AnimalInter, Predator {

    @Override
    public void voice() {

    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am a wild animal");
        if (isPredator()) {
            System.out.println(" and I am angry");
        }
        }


    @Override
    public boolean isPredator() {
        return false;
    }
}
