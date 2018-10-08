/**
 * 住址对象
 *
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public class Address {

    /**
     * 街道
     */
    private String street;

    /**
     * 门牌
     */
    private String door;

    public Address() {
    }

    public Address(String street, String door) {
        this.street = street;
        this.door = door;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }
}
