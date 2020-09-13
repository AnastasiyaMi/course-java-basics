package com.rakovets.java.practice.generics.model;

public class StringBankAccount extends BankAccount {
    String id;

    public StringBankAccount(String name, String surname) {
        super(name, surname);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
