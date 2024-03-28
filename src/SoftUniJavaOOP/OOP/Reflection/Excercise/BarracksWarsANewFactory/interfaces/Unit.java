package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.interfaces;

public interface Unit extends Destroyable, Attacker, barracksWars.interfaces.Unit {
    @Override
    default int getAttackDamage() {
        return 0;
    }

    @Override
    default int getHealth() {
        return 0;
    }

    @Override
    default void setHealth(int health) {

    }
}
