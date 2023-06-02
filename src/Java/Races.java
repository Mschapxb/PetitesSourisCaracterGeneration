package Java;
public class Races {


    public static class Souris implements IRaces {
        @Override
        public String getName() {
            return "Souris";
        }
        @Override
        public int[] getCharacteristicsModifiers() {
            int[] modifiers = new int[6];
            modifiers[0] = 1; // Strength +1
            modifiers[1] = 1; // Dexterity +1
            modifiers[2] = 1; // Constitution +1
            modifiers[3] = 1; // Intelligence +1
            modifiers[4] = 1; // Wisdom +1
            modifiers[5] = 1; // Charisma +1
            return modifiers;
        }
    }

    public static class Taupe implements IRaces {
        @Override
        public String getName() {
            return "Taupe";
        }

        @Override
        public int[] getCharacteristicsModifiers() {
            int[] modifiers = new int[6];
            modifiers[0] = 3; // Strength +3
            modifiers[1] = 3; // Dexterity +3
            modifiers[2] = 3; // Constitution +3
            modifiers[3] = -3; // Intelligence -3
            modifiers[4] = -3; // Wisdom -3
            modifiers[5] = -3; // Charisma -3
            return modifiers;
        }
    }

    public static class Robot implements IRaces {
        @Override
        public String getName() {
            return "Robot";
        }

        @Override
        public int[] getCharacteristicsModifiers() {
            return new int[6]; // No modifiers
        }
    }
}