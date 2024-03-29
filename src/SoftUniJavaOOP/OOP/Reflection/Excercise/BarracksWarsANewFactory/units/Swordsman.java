<<<<<<<< HEAD:src/SoftUniJavaOOP/OOP/Reflection/Excercise/BarracksWarsANewFactory/units/Swordsman.java
package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.units;
========
package barracksWarsTwo.models.units;
>>>>>>>> 7353e0765067345949fa83936db573ee3c92191f:src/barracksWarsTwo/models/units/Swordsman.java

public class Swordsman extends AbstractUnit {
    private static final int SWORDSMAN_HEALTH = 40;
    private static final int SWORDSMAN_DAMAGE = 13;

    public Swordsman() {
        super(SWORDSMAN_HEALTH, SWORDSMAN_DAMAGE);
    }
}
