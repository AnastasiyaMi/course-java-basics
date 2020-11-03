package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-mew";
    }
    @Override
    public String purr() {
        return "purr-purr";
    }
    @Override
    public void mew(Person person) {
        person.changeHappiness(-10);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(10);
    }

}
