package SoftUniJavaOOP.ExamPreparationOOP.robotService.entities.robot;

import SoftUniJavaOOP.ExamPreparationOOP.robotService.common.ExceptionMessages;

public abstract class BaseRobot implements Robot{

    private String name;
    private String kind;
    private int kilograms;
    private double price;


    public BaseRobot(String name, String kind, int kilograms, double price){

        if(kind==null || kind.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.ROBOT_KIND_CANNOT_BE_NULL_OR_EMPTY);
        }
        if(price<=0){
            throw new IllegalArgumentException(ExceptionMessages.ROBOT_PRICE_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
        }
        setName(name);
        this.kind = kind;
        this.kilograms = kilograms;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if(name==null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.ROBOT_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int getKilograms() {
        return kilograms;
    }

    @Override
    public double getPrice() {
        return price;
    }

    protected void setKilograms(int kilograms) {
        this.kilograms = getKilograms()+kilograms;
    }
}
