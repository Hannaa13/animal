package com.company;

import com.company.interfaces.impl.*;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat();
    cat.setName("Murka");
    cat.sayHello();
    cat.voice();

    Lion lion = new Lion();
    lion.sayHello();


    Giraffe giraffe = new Giraffe();
    giraffe.sayHello();

    Dog dog = new Dog();
    dog.setName("Sharik");
    dog.sayHello();
      dog.voice();

      GuideDog dogGuide = new GuideDog();
      dogGuide.setName("Friend");
      dogGuide.sayHello();


    Wolf wolf = new Wolf();
    wolf.sayHello();
    wolf.setColor("grey");


    Hamster hamster = new Hamster();
    hamster.setName("Hammi");
    hamster.sayHello();
    hamster.setWeight("500 gr");


    Crocodile crocodile = new Crocodile();
    crocodile.sayHello();

    Fish fish = new Fish();
    fish.sayHello();

    }
}
