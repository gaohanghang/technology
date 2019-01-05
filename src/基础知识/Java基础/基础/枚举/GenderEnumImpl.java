package 基础知识.Java基础.基础.枚举;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/05 22:24
 */
public enum  GenderEnumImpl implements GenderInfo {

    /**
     * 性别男
     */
    MALE("男") {

        @Override
        public void info() {
            System.out.println("!");
        }
    },
    FEMALE("女") {
        @Override
        public void info() {
            System.out.println("");
        }
    };

    private final String name;

    private GenderEnumImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
