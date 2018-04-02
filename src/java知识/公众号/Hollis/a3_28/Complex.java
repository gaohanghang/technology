package java知识.公众号.Hollis.a3_28;

public final class Complex {
    private final int a;
    private final int b;

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Complex add(Complex other) {
        return new Complex(a + other.a, b + other.b);
    }
}
