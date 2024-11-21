package com.ubik.formation.creational.factory.tp;

import java.util.Set;

public abstract class Character {
    public String name;
    public int health;
    public int attack;
    public Set<String> skills;

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public void useSpecialSkill() {
        for (String skill: skills) {
            System.out.println(name + " is using " + skill);
        }
    }
}
