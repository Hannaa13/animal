package com.company;


import com.company.interfaces.impl.Wild;

public class Wolf extends Wild {

    @Override
    public boolean isPredator() {
        return true;
    }
}
