package SoftUniJavaOOP.ExamPreparationOOP.christmasPastryShop.entities.delicacies.interfaces;

public class Stolen extends BaseDelicacy {
    private static final double InitialStolenPortion = 250;

    public Stolen(String name, double price) {
        super(name, InitialStolenPortion, price);
    }
}
