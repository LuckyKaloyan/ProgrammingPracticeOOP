package SoftUniJavaOOP.OOP.Reflection.Excercise.HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Field[] fields = RichSoilLand.class.getDeclaredFields();

        String input;
        while (!(input = reader.readLine()).equalsIgnoreCase("harvest")) {
            switch (input.toLowerCase()) {
                case "private":
                    printFieldsWithModifier(fields, Modifier.PRIVATE);
                    break;
                case "protected":
                    printFieldsWithModifier(fields, Modifier.PROTECTED);
                    break;
                case "public":
                    printFieldsWithModifier(fields, Modifier.PUBLIC);
                    break;
                case "all":
                    printAllFields(fields);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
    private static void printFieldsWithModifier(Field[] fields, int modifier) {
        for (Field field : fields) {
            if (field.getModifiers() == modifier) {
                System.out.println(String.format("%s %s %s",
                        Modifier.toString(field.getModifiers()),
                        field.getType().getSimpleName(),
                        field.getName()));
            }
        }
    }
    private static void printAllFields(Field[] fields) {
        for (Field field : fields) {
            System.out.println(String.format("%s %s %s",
                    Modifier.toString(field.getModifiers()),
                    field.getType().getSimpleName(),
                    field.getName()));
        }
    }
}