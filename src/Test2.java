public class Test2 {
    public static void main(String[] args) {
        System.out.println(testReturn());
    }

    // 如果finally 里有return try中return被忽略
    // 如果
    @SuppressWarnings("finally")
    public static int testReturn() {
        try {
            return 1;
        }catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
