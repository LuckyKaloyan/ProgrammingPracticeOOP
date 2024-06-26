package SoftUniJavaOOP.JavaAdvanced.Generics.Exercise.CustomListSorter;



import java.util.Collections;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {
        Collections.sort(customList.getData());
    }
}
