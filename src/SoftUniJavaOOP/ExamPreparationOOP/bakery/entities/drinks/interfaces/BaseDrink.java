package SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.drinks.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.bakery.common.ExceptionMessages;

public abstract class BaseDrink implements Drink {
    private String name;
    private int portion;
    private double price;
    private String brand;

    protected BaseDrink(String name, int portion, double price, String brand) {
        this.setName(name);
        this.setPortion(portion);
        this.setPrice(price);
        this.setBrand(brand);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NAME);
        }
        this.name = name;
    }

    private void setPortion(int portion) {
        if (portion <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PORTION);
        }
        this.portion = portion;
    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PRICE);
        }
        this.price = price;
    }

    private void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_BRAND);
        }
        this.brand = brand;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPortion() {
        return this.portion;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %dml - %.2flv", this.getName(), this.getBrand(), this.getPortion(), this.getPrice());
    }
}




