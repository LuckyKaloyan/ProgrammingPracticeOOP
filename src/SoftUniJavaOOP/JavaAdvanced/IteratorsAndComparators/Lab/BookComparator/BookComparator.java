package SoftUniJavaOOP.JavaAdvanced.IteratorsAndComparators.Lab.BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        // First, compare by title
        int titleComparison = b1.getTitle().compareTo(b2.getTitle());

        // If titles are the same, compare by year
        if (titleComparison == 0) {
            return Integer.compare(b1.getYear(), b2.getYear());
        }

        return titleComparison;
    }
}
