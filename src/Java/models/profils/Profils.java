package Java.models.profils;

import Java.interfaces.IProfils;

public class Profils {
    public static class Voyageur implements IProfils {
        @Override
        public String getName() {
            return "Voyageur";
        }

        @Override
        public int getLifePointsPerLevel() {
            return 10;
        }

        @Override
        public int getCharacteristicModifier(String characteristicName) {
            return 0;
        }
    }

    public static class Esclave implements IProfils {
        @Override
        public String getName() {
            return "Esclave";
        }

        @Override
        public int getLifePointsPerLevel() {
            return 6;
        }

        @Override
        public int getCharacteristicModifier(String characteristicName) {
            return 0;
        }
    }

    public static class Voleur implements IProfils {
        @Override
        public String getName() {
            return "Voleur";
        }

        @Override
        public int getLifePointsPerLevel() {
            return 8;
        }

        @Override
        public int getCharacteristicModifier(String characteristicName) {
            return 0;
        }
    }

    public static class Vétéran implements IProfils {
        @Override
        public String getName() {
            return "Vétéran";
        }

        @Override
        public int getLifePointsPerLevel() {
            return 12;
        }

        @Override
        public int getCharacteristicModifier(String characteristicName) {
            return 0;
        }
    }

    public static class Apostat implements IProfils {
        @Override
        public String getName() {
            return "Apostat";
        }

        @Override
        public int getLifePointsPerLevel() {
            return 8;
        }

        @Override
        public int getCharacteristicModifier(String characteristicName) {
            return 0;
        }
    }
}
