package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.core.commands;

import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.Executable;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.Repository;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;

public abstract class Command implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }

    protected String[] getData() {
        return data;
    }
}