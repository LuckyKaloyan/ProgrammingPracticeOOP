package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Excercise.ListyIterator;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class ListyIterator {
    private List<String> elements;
    private int currentIndex;

    public ListyIterator(List<String> elements) {
        this.elements = elements;
        this.currentIndex = 0;
    }

    public boolean move() {
        if (currentIndex < elements.size() - 1) {
            currentIndex++;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasNext() {
        return currentIndex < elements.size() - 1;
    }

    public void print() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(elements.get(currentIndex));
    }
}
