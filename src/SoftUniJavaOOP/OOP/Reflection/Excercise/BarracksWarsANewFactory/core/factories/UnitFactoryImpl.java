package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.core.factories;

import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.interfaces.Unit;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME = "SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
		try {
			Class<?> unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			return (Unit) unitClass.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new ExecutionControl.NotImplementedException("Invalid unit type!");
		}
	}
}
