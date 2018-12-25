package 王爵的技术小黑屋.javatips.debug;

/**
 * 回到上一步
 *
 * @author GaoHangHang
 * @date 2018/08/19 21:39
 **/
public class Example3 {

    private static int exclude0(String str) {
        str = str.toLowerCase();
        int count = str.replaceAll("[^0]+", "").length();
        return count;
    }

    static class User {
        String username;
        String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    public static void main(String[] args) {
        User user = new User("biezhi", "123456");
        if (user.username.isEmpty()) {
            System.out.println("username is empty.");
        }
        String name = "Hello W0rld";
        int count = exclude0(name);
        System.out.println(count);
    }

}
