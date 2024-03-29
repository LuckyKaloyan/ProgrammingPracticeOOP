package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory;

import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.interfaces.Repository;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.interfaces.Runnable;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.interfaces.UnitFactory;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.core.Engine;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.core.factories.UnitFactoryImpl;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
