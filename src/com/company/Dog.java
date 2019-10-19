package com.company;


import com.company.interfaces.impl.Pets;

public class Dog extends Pets {

    @Override
    public void voice() {
        System.out.println("Woof");
    }
}
