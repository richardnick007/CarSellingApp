package com.richard;

public class Car {
    private String Manufacturer_Name;
    private String modelName;
    private boolean isManual;
    private int wheels;
    private double current_mileage;
    private int asking_price;


    public Car(String manufacturer_Name, String modelName, boolean isManual, int wheels, double current_mileage, int asking_price) {
        Manufacturer_Name = manufacturer_Name;
        this.modelName = modelName;
        this.isManual = isManual;
        this.wheels = wheels;
        this.current_mileage = current_mileage;

    }

    public String getManufacturer_Name() {
        return Manufacturer_Name;
    }

    public String getModelName() {
        return modelName;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getWheels() {
        return wheels;
    }

    public double getCurrent_mileage() {
        return current_mileage;
    }

    public int getAsking_price() {
        return asking_price;
    }

}
