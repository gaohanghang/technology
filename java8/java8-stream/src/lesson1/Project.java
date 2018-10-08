package lesson1;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目
 *
 * @author: Gao HangHang
 * @date 2018/10/07
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

    /**
     * fork数
     */
    private Integer forks;

    public Project() {
    }

    public Project(String name, String language, Integer stars, String description, String author, Integer forks) {
        this.name = name;
        this.language = language;
        this.stars = stars;
        this.description = description;
        this.author = author;
        this.forks = forks;
    }

    public static List<Project> buildDate() {
        List<Project> data = new ArrayList<>();

        Project project1 = new Project();
        project1.setName("Blade");
        project1.setLanguage("java");
        project1.setAuthor("biezhi");
        project1.setStars(3500);
        project1.setForks(2000);
        project1.setDescription("Lightning fast and elegant mvc framework for Java8");

        Project project2 = new Project();
        project2.setName("Tale");


        data.add(project1);
        data.add(project2);

        return data;
    }

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

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

}
