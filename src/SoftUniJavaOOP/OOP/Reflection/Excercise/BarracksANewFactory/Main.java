package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksANewFactory;

import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksANewFactory.interfaces.Repository;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksANewFactory.interfaces.Runnable;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksANewFactory.interfaces.UnitFactory;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksANewFactory.core.Engine;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksANewFactory.core.factories.UnitFactoryImpl;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksANewFactory.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
