package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }
    @Override
    public String mew() {
        return "mew-mew-mew-mew";
    }
    @Override
    public String purr() {
        return "purr-purr-purr-purr";
    }
    @Override
    public void mew(Person person) {
        person.changeHappiness(-20);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(20);
    }
}
