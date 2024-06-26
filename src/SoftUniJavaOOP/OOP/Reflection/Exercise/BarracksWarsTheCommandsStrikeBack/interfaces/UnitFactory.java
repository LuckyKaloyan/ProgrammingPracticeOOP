package SoftUniJavaOOP.OOP.Reflection.Exercise.BarracksWarsTheCommandsStrikeBack.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException;
}