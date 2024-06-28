package SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.core.commands;

import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.interfaces.Repository;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class RetireCommand extends Command {

    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        try {
            this.getRepository().removeUnit(unitType);
            return unitType + " retired!";
        } catch (ExecutionControl.NotImplementedException e) {
            return "No such units in repository.";
        }
    }
}