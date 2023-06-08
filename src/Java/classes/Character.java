package Java.classes;

import Java.interfaces.ICharacter;
import Java.interfaces.ICharacteristics;
import Java.interfaces.IProfils;
import Java.interfaces.IRaces;

public class Character implements ICharacter {
    private String name;
    private IProfils profil;
    private IRaces race;
    private int[] characteristics;
    private int[] raceModifiers;

    public Character(String name, IProfils profil, IRaces race, int[] characteristics) {
        this.name = name;
        this.profil = profil;
        this.race = race;
        this.characteristics = characteristics;
        this.raceModifiers = race.getCharacteristicsModifiers();
    }

    public String getName() {
        return this.name;
    }

    public int getCharacteristic(String characteristicName) {
        int characteristicIndex = getCharacteristicIndex(characteristicName);
        if (characteristicIndex != -1) {
            return characteristics[characteristicIndex] + raceModifiers[characteristicIndex];
        }
        return 0;
    }

    public int getCharacteristicModifier(String characteristicName) {
        int characteristicValue = getCharacteristic(characteristicName);
        return characteristicValue / 2 - 5;
    }

    private int getCharacteristicIndex(String characteristicName) {
        switch (characteristicName) {
            case "Strength":
                return 0;
            case "Dexterity":
                return 1;
            case "Constitution":
                return 2;
            case "Intelligence":
                return 3;
            case "Wisdom":
                return 4;
            case "Charisma":
                return 5;
            default:
                return -1;
        }
    }

    public int getLifePoint() {
        return profil.getLifePointsPerLevel();
    }

    public int getMeleeAttack() {
        return getCharacteristicModifier("Strength") + 1;
    }

    public int getRangedAttack() {
        return getCharacteristicModifier("Dexterity") + 1;
    }

    public int getDefense() {
        return 10 + getCharacteristicModifier("Dexterity");
    }

    public IRaces getRace() {
        return this.race;
    }

    public IProfils getProfil() {
        return this.profil;
    }

    public int getLevel() {
        return 1;
    }
}
