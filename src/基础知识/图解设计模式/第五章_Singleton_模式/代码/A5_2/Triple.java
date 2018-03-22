package 基础知识.图解设计模式.第五章_Singleton_模式.代码.A5_2;

public class Triple {
    private static Triple[] triple = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2),
    };
    private int id;

    private Triple(int id) {
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triple[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
