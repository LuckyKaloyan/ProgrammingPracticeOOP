package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.core.factories;


import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.interfaces.Unit;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.interfaces.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME = "barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) {
		try {
			Class<?> unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			return (Unit) unitClass.getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
				 IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			return null;
		}
	}
}
