package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.CarSalesman;

public class Engine {

    String model;
    int power;
    int displacement = Integer.MIN_VALUE;
    String efficiency = "n/a";


    public Engine(String model, int power, int displacement, String efficiency){

        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;

    }
    public Engine(String model, int power, int displacement ){
        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }
    public Engine(String model, int power, String efficiency ){
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public Engine(String model, int power ){
        this.model = model;
        this.power = power;
    }



}
