package com.richard;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BankAccount Dera = new BankAccount(00233334,200000,"Olibie Chidera",
                "dexj@gmail.com","08038684624");
        Car Toyota002 = new Car("Toyota","camry",true,4,200,2000000);
        User User1 = new User(Dera,Toyota002,"Independence layout", "Enugu","Enugu","Nigeria");

        Car_Sales new_car = new Car_Sales(Toyota002,User1);
        new_car.checking();
    }
}
