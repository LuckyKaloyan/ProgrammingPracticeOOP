package SoftUniJavaOOP.OOP.Inheritance.Excercise.Animals;

public class Cat extends Animal{


    public Cat(){}

    public Cat(String name, int age,String gender){
        super(name,age,gender);
    }

    @Override
    public String produceSound() {
        return "Meow meow";
    }

}
