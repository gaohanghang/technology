package 基础知识.Java基础.基础.枚举;

/**
 * 性别枚举类，枚举值使用private构造器类完成实例
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/05 22:13
 */
public enum  GenderEnum {

    /**
     * 性别男
     */
    MALE("男"),

    /**
     * 性别女
     */
    FEMALE("女");

    // 姓名名称
    private final String name;

    /**
     * 枚举类的构造器只能使用private修饰
     */
    private GenderEnum(String name) {
        this.name = name;
    }

    /**
     * @return 性别中文名称
     */
    public String getName() {
        return name;
    }
}
