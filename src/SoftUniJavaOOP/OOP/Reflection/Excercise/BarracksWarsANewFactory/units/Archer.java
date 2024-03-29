<<<<<<<< HEAD:src/SoftUniJavaOOP/OOP/Reflection/Excercise/BarracksWarsANewFactory/units/Archer.java
package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.units;
========
package barracksWarsTwo.models.units;
>>>>>>>> 7353e0765067345949fa83936db573ee3c92191f:src/barracksWarsTwo/models/units/Archer.java

public class Archer extends AbstractUnit {
    private static final int ARCHER_HEALTH = 25;
    private static final int ARCHER_DAMAGE = 7;

    public Archer() {
        super(ARCHER_HEALTH, ARCHER_DAMAGE);
    }
}
