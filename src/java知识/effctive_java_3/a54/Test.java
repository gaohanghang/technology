package java知识.effctive_java_3.a54;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-05-26 16:05
 **/
public class Test {

    public static void main(String[] args) {

    }

    // Returns null to indicate an empty collection. Dont't do this
    private final List<Cheese> cheesesInStock = null;

    public List<Cheese> getCheeses() {
        return cheesesInStock.isEmpty() ? null : new ArrayList<>(cheesesInStock);
    }
}
