package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Exercise.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = dimestions[0];
            int y = dimestions[1];
            long sum = 0;
            int[][] matrix = new int[x][y];

        fillingTheMatrix(x, y, matrix);
        String command = scanner.nextLine();
        sum = gatheringPoints(command, scanner, matrix, sum);
        System.out.println(sum);


    }

    private static void fillingTheMatrix(int x, int y, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                matrix[i][j] = value++;
            }
        }
    }

    private static long gatheringPoints(String command, Scanner scanner, int[][] matrix, long sum) {
        while (!command.equals("Let the Force be with you"))
        {
            int[] ivoS = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evil = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int xE = evil[0];
            int yE = evil[1];

            while (xE >= 0 && yE >= 0)
            {
                if (xE < matrix.length && yE < matrix[0].length)
                {
                    matrix[xE] [yE] = 0;
                }
                xE--;
                yE--;
            }

            int xI = ivoS[0];
            int yI = ivoS[1];

            while (xI >= 0 && yI < matrix[1].length)
            {
                if (xI < matrix.length && yI >= 0 && yI < matrix[0].length)
                {
                    sum += matrix[xI][yI];
                }

                yI++;
                xI--;
            }

            command = scanner.nextLine();
        }
        return sum;
    }
}
