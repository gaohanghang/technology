package java知识.知识星球.成神之路.第014期Stream相关.Java8中stream相关用法;

/**
 * @author: Gao HangHang
 * @date 2018/10/09
 */
public class Book {
    private String name;
    private String author;
    private String Publisher;
    private Double price;

    public Book(String name, String author, String publisher, Double price) {
        this.name = name;
        this.author = author;
        Publisher = publisher;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
