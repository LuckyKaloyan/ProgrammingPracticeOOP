package SoftUniJavaOOP.OOP.Polymorphism.WildFarm;

import java.text.DecimalFormat;

public class Mouse extends Mammal{

    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion){
        super(animalType,animalName,animalWeight,livingRegion);
    }

    void makeSound(){
        System.out.println("SQUEEEAAAK!");
    }
    void eat(Food food){
        if(food instanceof Vegetable) {
            this.foodEaten = foodEaten + food.getQuantity();
        }else{
            System.out.println("Mice are not eating that type of food!");
        }
    }
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",animalType,animalName,decimalFormat.format(animalWeight),livingRegion,foodEaten);
    }
}
