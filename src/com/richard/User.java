package com.richard;

public class User {
    private BankAccount UserAccount;
    private Car theCar;
    private String Address;
    private String city;
    private String State;
    private String country;

    public User(BankAccount userAccount, Car theCar, String address, String city, String state, String country) {
        UserAccount = userAccount;
        this.theCar = theCar;
        Address = address;
        this.city = city;
        State = state;
        this.country = country;
    }

    public BankAccount getUserAccount() {
        return UserAccount;
    }

    public Car getTheCar() {
        return theCar;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return State;
    }

    public String getCountry() {
        return country;
    }
}
