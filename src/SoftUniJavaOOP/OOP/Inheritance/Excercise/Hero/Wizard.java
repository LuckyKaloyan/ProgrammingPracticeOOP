package SoftUniJavaOOP.OOP.Inheritance.Excercise.Hero;

public class Wizard extends Hero {
    public Wizard() {}

    public Wizard(String username, int level) {
        super.username = username;
        super.level = level;
    }
}