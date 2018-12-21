package java知识.java核心技术.a5.a5_6;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/20 22:41
 */
public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
