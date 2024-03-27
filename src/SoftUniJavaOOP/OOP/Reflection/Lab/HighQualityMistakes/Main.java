package SoftUniJavaOOP.OOP.Reflection.Lab.HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;
        Field[] fields = reflectionClass.getDeclaredFields();
        Arrays.sort(fields, Comparator.comparing(Field::getName));
        for (Field field : fields) {
            if (!field.getName().equals("nickName") && !java.lang.reflect.Modifier.isPrivate(field.getModifiers())) {
                System.out.printf("%s must be private!%n", field.getName());
            }
        }
        Method[] methods = reflectionClass.getDeclaredMethods();
        Arrays.sort(methods, Comparator.comparing(Method::getName));
        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.startsWith("get") && !java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                System.out.printf("%s have to be public!%n", methodName);
            } else if (methodName.startsWith("set") && !java.lang.reflect.Modifier.isPrivate(method.getModifiers())) {
                System.out.printf("%s have to be private!%n", methodName);
            }
        }
    }
}
