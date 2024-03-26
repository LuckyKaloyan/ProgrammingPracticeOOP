package SoftUniJavaOOP.OOP.Polymorphism.Excercise.VehiclesExtended;

import java.text.DecimalFormat;

public class Truck {
    private double fuel;
    private double consumption;
    private double tankCapacity;

    public Truck(double fuel, double consumption, double tankCapacity) {
        setFuel(fuel);
        setConsumption(consumption);
        setTankCapacity(tankCapacity);
    }

    public void setFuel(double fuel) {
        if (fuel < 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            this.fuel = fuel;
        }
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption + 1.6;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }


    public double getFuel() {
        return fuel;
    }

    public void drive(double distance) {
        if (fuel < consumption * distance) {
            System.out.println("Truck needs refueling");
        } else {
            fuel = fuel - (consumption * distance);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String output = decimalFormat.format(distance);
            System.out.println("Truck travelled " + output + " km");
        }
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            if (fuel + liters > tankCapacity) {
                System.out.println("Cannot fit fuel in tank");
            } else {
                fuel = fuel + liters;
            }
        }
    }
}