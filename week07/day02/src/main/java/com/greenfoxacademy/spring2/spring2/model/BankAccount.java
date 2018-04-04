package com.greenfoxacademy.spring2.spring2.model;

public class BankAccount {
    String  name;
    long balance;
    String animalType;
    String currency;


    public BankAccount(String name, int balance, String animalType, String currency) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
