package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Excercise.CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for(CardRank rank: CardRank.values()){
            System.out.println("Ordinal value: "+rank.getOrdinalnumber()+"; Name value: "+rank.name());
        }
    }

}
