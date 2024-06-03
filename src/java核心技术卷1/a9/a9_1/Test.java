package java核心技术卷1.a9.a9_1;

public class Test {
    public static void main(String[] args) {
        //Queue<Customer> expressLane = new CircularArrayQueue<>(100);
        //expressLane.add(new Customer("Harry"));

        Queue<Customer> expressLane = new LinkedListQueue<>();
        expressLane.add(new Customer("Harry"));
    }
}
