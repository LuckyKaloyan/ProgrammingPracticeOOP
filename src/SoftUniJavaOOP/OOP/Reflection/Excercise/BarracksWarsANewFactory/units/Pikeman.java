<<<<<<<< HEAD:src/SoftUniJavaOOP/OOP/Reflection/Excercise/BarracksWarsANewFactory/units/Pikeman.java
package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.units;
========
package barracksWarsTwo.models.units;
>>>>>>>> 7353e0765067345949fa83936db573ee3c92191f:src/barracksWarsTwo/models/units/Pikeman.java

public class Pikeman extends AbstractUnit {

	private static final int PIKEMAN_HEALTH = 30;
	private static final int PIKEMAN_DAMAGE = 15;

	public Pikeman() {
		super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
	}
}
