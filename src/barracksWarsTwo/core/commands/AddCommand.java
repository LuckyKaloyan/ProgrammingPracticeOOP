package barracksWarsTwo.core.commands;

import barracksWarsTwo.interfaces.Repository;
import barracksWarsTwo.interfaces.Unit;
import barracksWarsTwo.interfaces.UnitFactory;

public class AddCommand extends Command {

    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}
