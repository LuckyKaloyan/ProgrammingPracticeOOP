package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Excercise.ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<String> elements = new ArrayList<>();
        if (!command.startsWith("Create")) {
            throw new IllegalArgumentException("First command must start with 'Create'");
        }
        String[] tokens = command.split("\\s+");
        if (tokens.length > 1) {
            elements = new ArrayList<>();
            for (int i = 1; i < tokens.length; i++) {
                elements.add(tokens[i]);
            }
        }

        ListyIterator listyIterator = new ListyIterator(elements);

        while (true) {
            command = scanner.nextLine();
            if (command.equals("END")) {
                break;
            }
            switch (command) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}
