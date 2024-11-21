package com.ubik.formation.creational.builder.example;

public class Demo {
    public static void main(String[] args) {
        Computer computer= new Computer();
        computer.setProcessor("intel i7");
        computer.setGraphicCardEnabled(true);

        Computer computer2 = new Computer
                .ComputerBuilder("intel i7", 16)
                .isBluetoothEnabled(true)
                .build();
    }
}
