package SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.drinks.interfaces;

public class Water extends BaseDrink {
    private static final double WATER_PRICE = 1.50;

    public Water(String name, String brand, int portion) {
        super(name, portion, WATER_PRICE, brand);
    }
}