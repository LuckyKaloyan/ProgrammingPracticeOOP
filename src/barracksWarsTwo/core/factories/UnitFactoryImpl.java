package barracksWarsTwo.core.factories;

import barracksWarsTwo.interfaces.Unit;
import barracksWarsTwo.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME = "barracksWars.models.units.";

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
