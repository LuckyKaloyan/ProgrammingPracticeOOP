package SoftUniJavaOOP.JavaAdvanced.Generics.ExtraPractices.GenericOne;

public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(10);
        System.out.println("Content of integerBox: " + integerBox.getContent());

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics!");
        System.out.println("Content of stringBox: " + stringBox.getContent());
    }
}