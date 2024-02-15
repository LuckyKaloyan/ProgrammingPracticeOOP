package SoftUniJavaOOP.JavaAdvanced.Generics.Excercise.GenericBoxOfInteger;

class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.getClass().getName() + ": " + data.toString();
    }
}
