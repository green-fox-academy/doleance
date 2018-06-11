package com.greenfoxacademy.bankofsimba.Model;

import java.text.DecimalFormat;

public class BankAccount {
    private double balance;
    private String animalType;

    public double getBalance() {
        DecimalFormat df = new DecimalFormat("####0.00");
        return balance;
    }

    public String getBalanceTwoDecimal() {
        DecimalFormat df = new DecimalFormat("####0.00");
        return df.format(balance);
    }

    public String getAnimalType() {
        return animalType;
    }

    public BankAccount(double balance, String animalType) {
        this.balance = balance;
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return balance + " " + animalType;
    }
}
