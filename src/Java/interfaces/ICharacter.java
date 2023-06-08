package Java.interfaces;

public interface ICharacter {
    String getName();
    int getCharacteristic(String characteristicName);
    int getCharacteristicModifier(String characteristicName);
    int getLifePoint();
    int getMeleeAttack();
    int getRangedAttack();
    int getDefense();
    IRaces getRace();
    IProfils getProfil();
    int getLevel();

}
