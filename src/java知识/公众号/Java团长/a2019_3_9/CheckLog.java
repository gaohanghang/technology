package java知识.公众号.Java团长.a2019_3_9;

import java知识.公众号.Java团长.a2019_3_9.设计模式_深入理解单例模式.CheckType;

import java.io.Serializable;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/03/10 13:01
 */
public class CheckLog implements Serializable {
    private String id;
    private CheckType checkType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CheckType getCheckType() {
        return checkType;
    }

    public void setCheckType(CheckType checkType) {
        this.checkType = checkType;
    }
}
