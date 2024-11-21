package com.ubik.formation.creational.factory.tp;

import java.util.HashSet;

public class Warrior extends Character {
    public Warrior() {
        this.attack = 40;
        this.health = 80;
        this.skills = new HashSet<>();
        this.skills.add("Sword");
        this.skills.add("Axe");
    }
}
