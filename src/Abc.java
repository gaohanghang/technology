import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/11/14 2:57 PM
 */
public class Abc {
    int id;
    Boolean isClickable;

    public Abc(int id, Boolean isClickable) {
        this.id = id;
        this.isClickable = isClickable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isClickable() {
        return isClickable;
    }

    public void setClickable(boolean clickable) {
        isClickable = clickable;
    }

    @Override
    public String toString() {
        return "Abc{" +
                "id=" + id +
                ", isClickable=" + isClickable +
                '}';
    }
}
