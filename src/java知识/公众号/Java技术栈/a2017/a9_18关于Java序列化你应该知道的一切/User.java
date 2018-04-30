package java知识.公众号.Java技术栈.a2017.a9_18关于Java序列化你应该知道的一切;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 8953160687084760169L;

    private String username;
    private String address;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
