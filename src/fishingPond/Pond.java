package fishingPond;

import java.util.ArrayList;
import java.util.List;

public class Pond {
    private int capacity;
    private List<Fish> fishes;

    public Pond(int capacity) {
        this.capacity = capacity;
        this.fishes = new ArrayList<>();
    }

    public boolean addFish(Fish fish) {
        if (fish == null || fishes.size() >= capacity) {
            return false;
        }
        fishes.add(fish);
        return true;
    }

    public boolean removeFish(String species) {
        if (fishes.isEmpty()) {
            return false;
        }
        for (Fish fish : fishes) {
            if (fish.getSpecies().equals(species)) {
                fishes.remove(fish);
                return true;
            }
        }
        return false;
    }

    public Fish getOldestFish() {
        if (fishes.isEmpty()) {
            return null;
        }
        Fish oldest = fishes.get(0);
        for (Fish fish : fishes) {
            if (fish.getAge() > oldest.getAge()) {
                oldest = fish;
            }
        }
        return oldest;
    }

    public Fish getFish(String species) {
        if (fishes.isEmpty()) {
            return null;
        }
        for (Fish fish : fishes) {
            if (fish.getSpecies().equals(species)) {
                return fish;
            }
        }
        return null;
    }

    public int getCount() {
        return fishes.size();
    }

    public int getVacancies() {
        return Math.max(0, capacity - fishes.size());
    }

    public String report() {
        if (fishes.isEmpty()) {
            return "No fishes in the pond.";
        }
        StringBuilder reportBuilder = new StringBuilder("Fishes in the pond:\n");
        for (Fish fish : fishes) {
            reportBuilder.append(fish.toString()).append("\n");
        }
        return reportBuilder.toString();
    }
}
