package SoftUniJavaOOP.JavaAdvanced.Generics.Excercise.GenericCountMethodStrings;

import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Box<String>> boxList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Box<String> box = new Box<>(input);
            boxList.add(box);
        }
        Box<String> boxToCompare = new Box<>(scanner.nextLine());
        int results = countGreaterResults(boxList, boxToCompare);
        System.out.printf("%d%n", results);
    }

    private static <T extends Comparable<T>> int countGreaterResults(List<Box<T>> boxList, Box<T> boxToCompare) {
        int count = 0;
        for (Box<T> box : boxList) {
            if (box.compareTo(boxToCompare) > 0) {
                count++;
            }
        }
        return count;
    }
}
