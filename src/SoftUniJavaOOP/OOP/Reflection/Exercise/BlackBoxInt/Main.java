package SoftUniJavaOOP.OOP.Reflection.Exercise.BlackBoxInt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BlackBoxInt blackBoxInt = new BlackBoxInt();

        String input;
        while (!(input = scanner.nextLine()).equals("END")) {
            String[] tokens = input.split("_");
            int value = Integer.parseInt(tokens[1]);

            switch (tokens[0]) {
                case "add":
                    blackBoxInt.add(value);
                    break;
                case "subtract":
                    blackBoxInt.subtract(value);
                    break;
                case "multiply":
                    blackBoxInt.multiply(value);
                    break;
                case "divide":
                    blackBoxInt.divide(value);
                    break;
                case "leftShift":
                    blackBoxInt.leftShift(value);
                    break;
                case "rightShift":
                    blackBoxInt.rightShift(value);
                    break;
            }

            System.out.println(getInnerValue(blackBoxInt));
        }
    }

    public static int getInnerValue(BlackBoxInt blackBoxInt) throws Exception {
        return (int) BlackBoxInt.class.getDeclaredField("innerValue").get(blackBoxInt);
    }
}
