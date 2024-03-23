package SoftUniJavaOOP.OOP.Encapsulation.Excercise.ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost){
        setName(name);
        setCost(cost);
    }


    private void setName(String name) {
        if(null==name ||name.trim().isEmpty()){
            System.out.println("Name cannot be empty");
            return;
        }else{
        this.name = name;
    }
    }

    private void setCost(double cost) {
        if (cost < 0) {
            System.out.println("Money cannot be negative");
            return;
        } else {
            this.cost = cost;
        }
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
