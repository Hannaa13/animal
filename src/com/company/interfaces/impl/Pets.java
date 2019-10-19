package com.company.interfaces.impl;

import com.company.Animal;
import com.company.interfaces.AnimalInter;
import com.company.interfaces.Trained;
import com.company.interfaces.Vaccinated;

public class Pets extends Animal implements AnimalInter, Vaccinated, Trained {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {

    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + getName());
        if (isTrained()) {
            System.out.println("and I can take you home");
        }
    }

    @Override
    public boolean isVaccinated() {
        return true;
    }

    @Override
    public boolean isTrained() {
        return false;
    }
}
