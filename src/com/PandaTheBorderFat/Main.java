package com.PandaTheBorderFat;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(200, 500, 100);
        Case theCase = new Case("Corsair", "B100", dimensions);

        Monitor monitor = new Monitor("Dell", "AX27", 27, new Resolution(1980, 1080));

        MotherBoard motherBoard = new MotherBoard("Asus", "Rog", 6);

        PC jarvis = new PC(theCase, monitor, motherBoard);

        System.out.println("Monitor:" + "\n--------");
        System.out.println("Manufacturer : " + jarvis.getMonitor().getManufacturer());
        System.out.println("Model : " + jarvis.getMonitor().getModel());
        System.out.println("Reolution : " + jarvis.getMonitor().getResolution().getWidth() + "*"
        + jarvis.getMonitor().getResolution().getHeight() + " pixels");
        System.out.println("Size : " + jarvis.getMonitor().getSize() + " inches");

        System.out.println("MotherBoard:" + "\n------------");
        System.out.println("Manufacturer : " + jarvis.getMotherBoard().getManufacturer());
        System.out.println("Model : " + jarvis.getMotherBoard().getModel());
        System.out.println("Number of slots : " + jarvis.getMotherBoard().getNumberOfSlots());

        System.out.println("Case:" + "\n-----");
        System.out.println("Manufacturer : " + jarvis.getTheCase().getManufacturer());
        System.out.println("Model : " + jarvis.getTheCase().getModel());
        System.out.println("Dimensions : " + jarvis.getTheCase().getDimensions().getWidth() +
        "*" + jarvis.getTheCase().getDimensions().getHeight() + "*" +
        jarvis.getTheCase().getDimensions().getDepth());


    }
}
