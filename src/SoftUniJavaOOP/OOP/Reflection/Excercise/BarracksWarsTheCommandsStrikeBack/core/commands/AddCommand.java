package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.core.commands;

import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.Repository;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.Unit;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class AddCommand extends Command {

    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        try {
            Unit unitToAdd = this.getUnitFactory().createUnit(unitType);
            this.getRepository().addUnit(unitToAdd);
            return unitType + " added!";
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException("Error: Unexpected exception occurred.", e);
        }
    }
}
