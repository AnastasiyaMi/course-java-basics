package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat{
    public Persian(String name) {
        super(name);
    }
    @Override
    public String mew() {
        return "mew-mew-mew";
    }
    @Override
    public String purr() {
        return "purr-purr-purr";
    }
    @Override
    public void mew(Person person) {
        person.changeHappiness(-15);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(15);
    }
}
