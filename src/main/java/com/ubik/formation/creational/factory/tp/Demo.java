package com.ubik.formation.creational.factory.tp;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character archer = factory.createCharacter("Archer");
        Character warrior = factory.createCharacter("Warrior");
        Character mage = factory.createCharacter("Mage");

        mage.useSpecialSkill();
        archer.useSpecialSkill();
        warrior.useSpecialSkill();
    }
}
