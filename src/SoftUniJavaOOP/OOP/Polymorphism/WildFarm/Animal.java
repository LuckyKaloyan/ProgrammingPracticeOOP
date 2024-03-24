package SoftUniJavaOOP.OOP.Polymorphism.WildFarm;

public abstract class Animal {
    String animalName;
    String animalType;
    Double animalWeight;
    Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight){
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten =0;
    }

    void makeSound(){}
    void eat(Food food){
        foodEaten = foodEaten+food.getQuantity();
    }
}
