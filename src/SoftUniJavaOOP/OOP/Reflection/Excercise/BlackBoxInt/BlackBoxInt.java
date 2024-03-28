package SoftUniJavaOOP.OOP.Reflection.Excercise.BlackBoxInt;

class BlackBoxInt {
    public static final int DEFAULT_VALUE = 0;
    public int innerValue;

    public BlackBoxInt() {
        this.innerValue = DEFAULT_VALUE;
    }

    public void add(int addend) {
        this.innerValue += addend;
    }

    public void subtract(int subtrahend) {
        this.innerValue -= subtrahend;
    }

    public void multiply(int multiplier) {
        this.innerValue *= multiplier;
    }

    public void divide(int divider) {
        this.innerValue /= divider;
    }

    public void leftShift(int shifter) {
        this.innerValue <<= shifter;
    }

    public void rightShift(int shifter) {
        this.innerValue >>= shifter;
    }
}
