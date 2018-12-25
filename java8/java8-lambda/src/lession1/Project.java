package lession1;


/**
 * 项目
 *
 * @author: Gao HangHang
 * @date 2018/10/05
 */
public class Project {

    /**
     * 项目名称
     */
    private String name;

    /**
     * 编程语言
     */
    private String language;

    /**
     * star 数
     */
    private Integer stars;

    /**
     * 描述
     */
    private String description;

    /**
     * 作者
     */
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}