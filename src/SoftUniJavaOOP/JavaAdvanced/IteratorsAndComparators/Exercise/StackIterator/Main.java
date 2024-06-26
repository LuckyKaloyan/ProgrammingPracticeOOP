package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Exercise.StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        StackIterator stack = new StackIterator();

        while (!input.equals("END")) {
            String[] lines = input.split("\\s+");

            switch (lines[0]) {
                case "Push":
                    int[] elements = Arrays.stream(input.substring(5).trim().split(", ")).mapToInt(Integer::parseInt).toArray();
                    stack.push(elements);
                    break;
                case "Pop":
                    stack.pop();
                    break;
                default:
                    break;
            }
            input = bufferedReader.readLine();
        }


        for (int i = 0; i < 2; i++) {
            for (int element : stack) {
                System.out.println(element);
            }
        }
    }
}
