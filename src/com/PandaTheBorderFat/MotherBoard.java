package com.PandaTheBorderFat;

public class MotherBoard {
    private String manufacturer;
    private String model;
    private int numberOfSlots;

    public MotherBoard(String manufacturer, String model, int numberOfSlots) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.numberOfSlots = numberOfSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }
}
