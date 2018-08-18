package com.PandaTheBorderFat;

public class Monitor {
    private String manufacturer;
    private String model;
    private int size;
    private Resolution resolution;

    public Monitor(String manufacturer, String model, int size, Resolution resolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
