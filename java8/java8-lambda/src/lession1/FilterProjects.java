package lession1;

import lession1.predicate.ProjectLanguagePredicate;
import lession1.predicate.ProjectStarPredicate;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 过滤 project
 *
 * @author: Gao HangHang
 * @date 2018/10/05
 */
public class FilterProjects {

    /**
     * 过滤 Java 项目
     *
     * @param projects
     * @return
     */
    public static List<Project> filterJavaProjects(List<Project> projects) {
        List<Project> result = new ArrayList<>();
        for (Project project : projects) {
            if ("java".equals(project.getLanguage())) {
                result.add(project);
            }
        }
        return result;
    }

    /**
     * 按语言过滤
     *
     * @param projects
     * @param language
     * @return
     */
    public static List<Project> filterLanguageProjects(List<Project> projects, String language) {
        List<Project> result = new ArrayList<>();
        for (Project project : projects) {
            result.add(project);
        }
        return result;
    }


    /**
     * 按语言和 star 数过滤
     *
     * @param projects
     * @param language
     * @param stars
     * @return
     */
    public static List<Project> filterLanguageAndStarProjects(List<Project> projects, String language, int stars) {
        List<Project> result = new ArrayList<>();
        for (Project project : projects) {
            if (language.equals(project.getLanguage()) && project.getStars() > stars) {
                result.add(project);
            }
        }
        return result;
    }

    /**
     * 按照断言条件过滤
     *
     * @param projects
     * @param projectPredicate
     * @return
     */
    public static List<Project> filterProjects(List<Project> projects, ProjectPredicate projectPredicate) {
        List<Project> result = new ArrayList<>();
        for (Project project : projects) {
            if (projectPredicate.test(project)) {
                result.add(project);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Project> data = new ArrayList<>();

        Project project1 = new Project();
        project1.setName("Blade");
        project1.setLanguage("java");
        project1.setAuthor("biezhi");
        project1.setStars(3500);
        project1.setDescription("Lightning fast and elegant mvc framework for Java8");

        data.add(project1);


        List<Project> projects = filterJavaProjects(data);

        projects = filterLanguageProjects(data, "python");

        projects = filterLanguageAndStarProjects(data, "js", 1000);

        projects = filterProjects(data, new ProjectLanguagePredicate("Python"));

        projects = filterProjects(data, new ProjectStarPredicate(1000));

        System.out.println(projects.size());

        //JButton jButton = null;
        //jButton.addActionListener(e -> System.out.println("按钮被按下了"));

        // 1. 值参数化：啰嗦、死板
        // 2. 行为参数化：简洁、灵活


        List<Project> filter = filter(data, project -> project.getStars() > 1000);

        data.sort(Comparator.comparing(Project::getStars));

        System.out.println(data);

        Runnable task = () -> System.out.println("Hello Eorld");

        Thread t = new Thread(task);
        t.start();


    }


}
