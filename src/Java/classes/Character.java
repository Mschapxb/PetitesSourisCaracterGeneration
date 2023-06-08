package Java.classes;

import Java.interfaces.ICharacter;
import Java.interfaces.IProfils;
import Java.interfaces.IRaces;
import Java.models.races.Races;
import Java.models.profils.Profils;
import Java.utils.DiceRoller;


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

    @Override
    public int getCharacteristic(String characteristicName) {
        switch (characteristicName) {
            case "Strength":
                return characteristics[0] + raceModifiers[0];
            case "Dexterity":
                return characteristics[1] + raceModifiers[1];
            case "Constitution":
                return characteristics[2] + raceModifiers[2];
            case "Intelligence":
                return characteristics[3] + raceModifiers[3];
            case "Wisdom":
                return characteristics[4] + raceModifiers[4];
            case "Charisma":
                return characteristics[5] + raceModifiers[5];
            default:
                return 0;
        }
    }

    @Override
    public int getCharacteristicModifier(String characteristicName) {
        int characteristicValue = getCharacteristic(characteristicName);
        return (characteristicValue / 2) - 5;
    }

    @Override
    public int getLifePoint() {
        return profil.getLifePointsPerLevel();
    }

    @Override
    public int getMeleeAttack() {
        return getCharacteristicModifier("Strength") + 1;
    }

    @Override
    public int getRangedAttack() {
        return getCharacteristicModifier("Dexterity") + 1;
    }

    @Override
    public int getDefense() {
        return 10 + getCharacteristicModifier("Dexterity");
    }

    @Override
    public IRaces getRace() {
        return this.race;
    }

    @Override
    public IProfils getProfil() {
        return this.profil;
    }

    @Override
    public int getLevel() {
        return 1;
    }
}
