package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
        public String name;

        public Cat (String name){
        this.name = name;
    }
    public String mew() {
            return "mew";
    }
    public String purr() {
            return "purr";
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void mew(Person person) {
        person.changeHappiness(-5);
    }
    public void purr(Person person) {
        person.changeHappiness(5);
    }
}

