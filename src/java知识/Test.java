package java知识;

public class Test {
    // 分页
    public static void main(String[] args) {
        Integer totalCount = 10;
        Integer pageSize = 10;
        // (10 + 9 ) / 10
        Integer totalPage = (totalCount + pageSize - 1) / pageSize;
        System.out.println(totalPage);
    }
}
