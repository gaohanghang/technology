import java.math.BigDecimal;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/11/25 11:41 PM
 */
public class DemoClass {
    int id;
    BigDecimal price;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DemoClass{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
