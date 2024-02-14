package easterBasket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket {
    private String material;
    private int capacity;
    private List<Egg> data;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        // Initialize data with a new ArrayList
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        if (data.size() < capacity) {
            data.add(egg);
        } else {
            throw new IllegalStateException("Basket is full");
        }
    }

    public boolean removeEgg(String color) {
        if (data.isEmpty()) {
            return false;
        }
        Iterator<Egg> iterator = data.iterator();
        while (iterator.hasNext()) {
            Egg egg = iterator.next();
            if (egg.getColor().equals(color)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }


    public Egg getStrongestEgg() {
        Egg strongestEgg = null;
        int maxStrength = Integer.MIN_VALUE;
        for (Egg egg : data) {
            if (egg.getStrength() > maxStrength) {
                maxStrength = egg.getStrength();
                strongestEgg = egg;
            }
        }
        return strongestEgg;
    }

    public Egg getEgg(String color) {
        for (Egg egg : data) {
            if (egg.getColor().equals(color)) {
                return egg;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String report() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(material).append(" basket contains:\n");
        for (Egg egg : data) {
            reportBuilder.append(egg.toString()).append("\n");
        }
        return reportBuilder.toString();
    }
}
