package SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack;

import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.interfaces.Repository;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.interfaces.Runnable;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.core.Engine;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.core.factories.UnitFactoryImpl;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
