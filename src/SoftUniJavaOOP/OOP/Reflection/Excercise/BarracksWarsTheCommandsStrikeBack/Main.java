package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack;

import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.Repository;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.Runnable;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.core.Engine;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.core.factories.UnitFactoryImpl;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
