package java知识.掘金.aJava8新特性之Optional类;

import java.util.Optional;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-12-26 12:35
 **/
public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setName("六脉神剑");
        System.out.println(test(user));
    }

    // 以前的代码1.0
    public static String test2(User user) {
        if (user != null) {
            String name = user.getName();
            if (name != null) {
                return name.toUpperCase();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    // 以前的代码2.0
    public static String test3(User user) {
        if (user != null && user.getName() != null) {
            return user.getName().toUpperCase();
        } else {
            return null;
        }
    }

    // 现在的代码
    public static String test(User user) {
        return Optional.ofNullable(user)
                .map(user1 -> user1.getName())
                .map(s -> s.toUpperCase()).orElse(null);
    }

}
