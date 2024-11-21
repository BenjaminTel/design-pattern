package com.ubik.formation.creational.factory.tp;

import java.util.HashSet;

public class Mage extends Character {
    public Mage() {
        this.name = "Random";
        this.attack = 70;
        this.health = 40;
        this.skills = new HashSet<>();
        this.skills.add("Fire ball");
        this.skills.add("Freeze");
    }
}
