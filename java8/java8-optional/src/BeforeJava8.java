/**
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public class BeforeJava8 {

    /**
     * Java 8 之前
     *
     * @param user
     */
    public void saveUser(User user) {
        if (null != user) {
            if (null != user.getAddress()) {
                // 保存 user
            }
        }
    }

    /**
     * 过多的退出语句
     *
     * @param user
     */
    public void saveUser2(User user) {
        if (null == user) {
            return;
        }
        if (null == user.getAddress()) {
            return;
        }
        // 保存 user
    }

}
