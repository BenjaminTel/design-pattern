package com.ubik.formation.creational.builder.tp;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public Model model;
    public Engine engine;
    public String color;
    public int seats;

    List<String> extras;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    public String displayCar() {
        return "Car{" +
                "model=" + model +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", extras=" + extras +
                '}';
    }

    public Car (CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.color = (builder.color == null) ? "undefined" : builder.color;
        this.seats = builder.seats;
        this.extras = builder.extras;
    }

    public static class CarBuilder {
        public Model model;
        public Engine engine;
        public String color;
        public int seats;
        public List<String> extras;

        public CarBuilder(Model model, Engine engine, int seats) {
            this.model = model;
            this.engine = engine;
            this.seats = seats;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder addExtra(List<String> extras) {
            if (extras != null) {
                this.extras = new ArrayList<>(extras);
            }
            return this;
        }

        public Car build() {
            if (this.model.equals(Model.SUV) && this.seats < 5) {
                throw new RuntimeException("Erreur : SUV avec moins de 5 sièges");
            }
            if (this.model.equals(Model.SPORT) && this.engine.equals(Engine.ELECTRIC)) {
                throw new RuntimeException("Erreur : Modèle Sport avec un moteur électrique.");
            }
            return new Car(this);
        }


    }

    public enum Model {
        SUV, BERLINE, SPORT;
    }

    public enum Engine {
        ELECTRIC, HYBRID, GASOLINE;
    }
}
