package SoftUniJavaOOP.OOP.WorkingWithAbstraction.Lab.RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i<size-1){System.out.print(" *");}
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }




    }
}
