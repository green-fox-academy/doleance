package com.greenfoxacademy.bankofsimba.Model;

import java.text.DecimalFormat;

public class BankAccount {
    private String owner;
    private double balance;
    private String animalType;
    private boolean isKing;
    private boolean isGood;

    public String getOwner() {
        return owner;
    }

    public boolean isKing() {
        return isKing;
    }

    public boolean isGood() {
        return isGood;
    }

    public double getBalance() {
        return balance;
    }

    public String getBalanceTwoDecimal() {
        DecimalFormat df = new DecimalFormat("####0.00");
        return df.format(balance);
    }

    public String getAnimalType() {
        return animalType;
    }

    public BankAccount(String owner, double balance, String animalType, boolean isKing, boolean isGood) {
        this.owner = owner;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGood = isGood;
    }

    @Override
    public String toString() {
        return owner + " " + balance + " " + animalType;
    }
}
