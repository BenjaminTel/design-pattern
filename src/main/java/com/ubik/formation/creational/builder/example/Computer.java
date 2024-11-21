package com.ubik.formation.creational.builder.example;

public class Computer {

    //Mandatory
    private String processor;
    private int ram;

    //Optional
    private int storage;
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public Computer(){

    }

    public Computer(ComputerBuilder computerBuilder) {
        this.processor = computerBuilder.processor;
        this.ram = computerBuilder.ram;
        this.storage = computerBuilder.storage;
        this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public void setGraphicCardEnabled(boolean graphicCardEnabled) {
        isGraphicCardEnabled = graphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

   public static class ComputerBuilder {
        private String processor;
        private int ram;
        private int storage;
        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String processor, int ram) {
            this.processor = processor;
            this.ram = ram;
        }


        public ComputerBuilder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder isGraphicCardEnabled(boolean isGraphicCardEnabled) {
            this.isGraphicCardEnabled = isGraphicCardEnabled;
            return this;
        }

        public ComputerBuilder isBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
   }
}
