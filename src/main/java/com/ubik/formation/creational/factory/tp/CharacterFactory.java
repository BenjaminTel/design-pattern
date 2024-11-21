package com.ubik.formation.creational.factory.tp;

public class CharacterFactory {

    public Character createCharacter(String characterType) {
        if (characterType != null) {
            if (characterType.equalsIgnoreCase("Archer")) {
                return new Archer();
            }
            if (characterType.equalsIgnoreCase("Mage")) {
                return new Mage();
            }
            if (characterType.equalsIgnoreCase("Warrior") || characterType.equalsIgnoreCase("Guerrier")) {
                return new Warrior();
            }
        }
        return null;
    }
}
