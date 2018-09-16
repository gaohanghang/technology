package main.java.chapter_07;

import java.util.List;

/**
 * 声明代码的意图
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example11 {

    static class Product {
        Integer price;
    }

    public void displayProducts(List<Product> products) {
        products.sort(this::compareProductByPrice);

        // 从高到低的显示每个商品的价格
        for (Product product : products) {
            displayPice(product.price);
        }

    }

    private void displayPice(Integer price) {

    }

    private int compareProductByPrice(Product p1, Product p2) {
        return p2.price.compareTo(p1.price);
    }

}
