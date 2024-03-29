package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsANewFactory.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException;
}