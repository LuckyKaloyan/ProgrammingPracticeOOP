package SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.discoverer;

public class Archaeologist extends BaseDiscoverer {
    private static final double INITIAL_ENERGY = 60;

    public Archaeologist(String name) {
        super(name, INITIAL_ENERGY);
    }
}
