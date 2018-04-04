package com.greenfoxacademy.spring2.spring2.model;

public class BankAccount {
    String name;
    long balance;
    String animalType;
    String currency;
    boolean king;


    public BankAccount(String name, long balance, String animalType, String currency, boolean king) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.king = king;
    }

    @Override
    public String toString() {
        if (this.king == false) {
            return " <font color=\"black\"> " +  "name='" + name + '\'' +
                    ", balance=" + balance + " " + currency +
                    ", animalType='" + animalType +
                    '}' + "!</font> ";
        } else
            return " <font color=\"gold\"> " + "name='" + name + '\'' +
                    ", balance=" + balance + " " + currency +
                    ", animalType='" + animalType +
                    '}' + "!</font> ";


    }


    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean isKing() {
        return king;
    }
}
