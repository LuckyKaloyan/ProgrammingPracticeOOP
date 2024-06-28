package SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksANewFactory;

import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksANewFactory.interfaces.Repository;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksANewFactory.interfaces.Runnable;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksANewFactory.interfaces.UnitFactory;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksANewFactory.core.Engine;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksANewFactory.core.factories.UnitFactoryImpl;
import SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksANewFactory.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
