package com.ubik.formation.creational.factory.tp;

import java.util.HashSet;

public class Archer extends Character {
    public Archer() {
        this.health = 30;
        this.attack = 50;
        this.skills = new HashSet<>();
        this.skills.add("Shot an arrow");
    }
}
