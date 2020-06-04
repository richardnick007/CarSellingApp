package com.richard;

public class Car_Sales {
    private Car theCar;
    private User theUser;

    public Car_Sales(Car theCar, User theUser) {
        this.theCar = theCar;
        this.theUser = theUser;
    }
public void checking(){
    int balance = getTheUser().getUserAccount().getBalance();
    int car_cost = getTheCar().getAsking_price();
    if(balance < car_cost){
        System.out.println("you can't buy car");
    }else{
        System.out.println("Take Keys");
    }
}
    public Car getTheCar() {
        return theCar;
    }

    public User getTheUser() {
        return theUser;
    }
}

