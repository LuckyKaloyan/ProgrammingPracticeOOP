package SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.core.factories;

import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.interfaces.Unit;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME = "SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.units.";

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
