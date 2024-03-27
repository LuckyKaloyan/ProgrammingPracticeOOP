package GettersAndSetters;


import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Class<?> reflections = Reflection.class;
        Method[] methods = reflections.getDeclaredMethods();
        sortMethods(methods);
        for (Method method : methods) {
            if (isGetter(method)) {
                System.out.printf("%s will return class %s%n", method.getName(), method.getReturnType().getTypeName());
            }
        }
        for (Method method : methods) {
            if (isSetter(method)) {
                System.out.printf("%s and will set field of class %s%n", method.getName(), method.getParameterTypes()[0].getTypeName());
            }
        }
    }
    private static void sortMethods(Method[] methods) {
        Arrays.sort(methods, Comparator.comparing(Method::getName));
    }
    private static boolean isGetter(Method method) {
        return method.getName().startsWith("get") &&
                method.getParameterCount() == 0 &&
                !void.class.equals(method.getReturnType());
    }
    private static boolean isSetter(Method method) {
        return method.getName().startsWith("set") &&
                method.getParameterCount() == 1 &&
                void.class.equals(method.getReturnType());
    }
}