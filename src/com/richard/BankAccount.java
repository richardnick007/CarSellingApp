package com.richard;

import java.sql.SQLOutput;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String accountName;
    private String email;
    private String phoneNumber;

    public BankAccount(int accountNumber, int balance, String accountName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void depositFund(double amount) {
        this.balance+=amount;
        System.out.println("you new available balance is:" + " " + amount);
    }
    public void withdrawFunds(double withdrawAmount){
        double current = this.balance;
        if((this.balance-withdrawAmount) <0){
            System.out.println("you have insufficient funds");
        }else{
            this.balance-=withdrawAmount;
            System.out.println("Withdrawal of :" + " " + withdrawAmount + " " + "Successful");
        }
    }
}
