package java知识.java核心技术.a6.a6_2.a6_3_5;

import java.io.Serializable;

/**
 * @author GaoHangHang
 * @date 2018/06/28 14:04
 **/
public class Person implements Serializable {

    private static final long serialVersionUID = 434551870086116603L;

    String name;
    String firstName;
    String lastName;
    String middleName;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
}
