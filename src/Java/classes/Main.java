package Java.classes;

import Java.interfaces.ICharacter;
import Java.interfaces.IProfils;
import Java.interfaces.IRaces;
import Java.models.profils.Profils;
import Java.models.races.Races;
import Java.utils.DiceRoller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter character name:");
        String name = scanner.nextLine();

        System.out.println("Choose race (Souris, Taupe, Robot):");
        String raceName = scanner.nextLine();
        IRaces race;
        switch (raceName) {
            case "Taupe":
                race = new Races.Taupe();
                break;
            case "Robot":
                race = new Races.Robot();
                break;
            default:
                race = new Races.Souris();
                break;
        }

        System.out.println("Choose profil (Voyageur, Esclave, Voleur, Vétéran, Apostat):");
        String profilName = scanner.nextLine();
        IProfils profil;
        switch (profilName) {
            case "Voyageur":
                profil = new Profils.Voyageur();
                break;
            case "Esclave":
                profil = new Profils.Esclave();
                break;
            case "Voleur":
                profil = new Profils.Voleur();
                break;
            case "Vétéran":
                profil = new Profils.Vétéran();
                break;
            case "Apostat":
                profil = new Profils.Apostat();
                break;
            default:
                profil = new Profils.Voyageur();
                break;
        }

        int[] characteristics = rollCharacteristics();
        ICharacter character = new Character(name, profil, race, characteristics);
        printCharacterInfo(character);
    }

    private static int[] rollCharacteristics() {
        int[] characteristics = new int[6];

        for (int i = 0; i < 6; i++) {
            characteristics[i] = DiceRoller.rollDice();
        }

        return characteristics;
    }

    private static void printCharacterInfo(ICharacter character) {
        System.out.println("Character: " + character.getName());
        System.out.println("Profil: " + character.getProfil().getName());
        System.out.println("Race: " + character.getRace().getName());
        System.out.println("Strength: " + character.getCharacteristic("Strength"));
        System.out.println("Dexterity: " + character.getCharacteristic("Dexterity"));
        System.out.println("Constitution: " + character.getCharacteristic("Constitution"));
        System.out.println("Intelligence: " + character.getCharacteristic("Intelligence"));
        System.out.println("Wisdom: " + character.getCharacteristic("Wisdom"));
        System.out.println("Charisma: " + character.getCharacteristic("Charisma"));
        System.out.println("Life points: " + character.getLifePoint());
        System.out.println("Level: " + character.getLevel());
        System.out.println("Melee Attack: " + character.getMeleeAttack());
        System.out.println("Ranged Attack: " + character.getRangedAttack());
        System.out.println("Defense: " + character.getDefense());
    }
}
