package SoftUniJavaOOP.ExamPreparationOOP.aquarium.entities.fish;

import SoftUniJavaOOP.ExamPreparationOOP.aquarium.common.ExceptionMessages;

public class SaltwaterFish implements Fish {
    private String name;
    private String species;
    private int size;
    private double price;

    public SaltwaterFish(String name, String species, double price) {
        setName(name);
        setSpecies(species);
        setSize(5);
        setPrice(price);
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.FISH_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setSpecies(String species) {
        if (species == null || species.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.SPECIES_NAME_NULL_OR_EMPTY);
        }
        this.species = species;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.FISH_PRICE_BELOW_OR_EQUAL_ZERO);
        }
        this.price = price;
    }

    @Override
    public void eat() {
        size += 2;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}