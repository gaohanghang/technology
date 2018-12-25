package lesson3;

import lession1.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * lambdas
 *
 * @author: Gao HangHang
 * @date 2018/10/06
 */
public class Lambdas {

    public static List<Project> buildData() {
        List<Project> data = new ArrayList<>();

        Project project1 = new Project();
        project1.setName("Blade");
        project1.setLanguage("java");
        project1.setAuthor("biezhi");
        project1.setStars(3500);
        project1.setDescription("Lightning fast and elegant mvc framework for Java8");

        Project project2 = new Project();
        project2.setName("Tale");
        project2.setLanguage("java");
        project2.setAuthor("biezhi");
        project2.setStars(2600);
        project2.setDescription("Best beautiful java blog, worth a try");


        Project project3 = new Project();
        project3.setName("Vue.js");
        project3.setLanguage("js");
        project3.setAuthor("yyx990803");
        project3.setStars(83000);
        project3.setDescription("A progressive, incrementally-adoptable JavaScript framework for building UI on the web.");


        Project project4 = new Project();
        project4.setName("Flask");
        project4.setLanguage("python");
        project4.setAuthor("pallets");
        project4.setStars(10500);
        project4.setDescription("The Python micro framework for building web applications");

        Project project5 = new Project();
        project5.setName("Elves");
        project5.setLanguage("java");
        project5.setAuthor("biezhi");
        project5.setStars(200);
        project1.setDescription("Spider");

        data.add(project1);
        data.add(project2);
        data.add(project3);
        data.add(project4);
        data.add(project5);

        return data;
    }

    public static void main(String[] args) {
        List<Project> projects = buildData();
        //List<String>  names    = getNames(projects);
        //List<String> names = getNames(projects, project -> project.getStars() > 1000);
        List<String> names = getNames(projects, project -> project.getStars() > 1000, project -> project.getDescription());
        List<Integer> stars = getNames(projects, project -> project.getStars() > 1000, ProjectFunction.buildStarFunction());
        System.out.println(stars);
        //names.forEach(name -> System.out.println(name));

    }

    public static List<String> getNames(List<Project> projects) {
        List<String> names = new ArrayList<>();
        for (Project project : projects) {
            names.add(project.getName());
        }
        return names;
    }

    public static List<String> getNames(List<Project> projects, Predicate<Project> predicate) {
        List<String> names = new ArrayList<>();
        for (Project project : projects) {
            if (predicate.test(project)) {
                names.add(project.getName());
            }
        }
        return names;
    }

    public static <R> List<R> getNames(List<Project> projects, Predicate<Project> predicate, Function<Project, R> function) {
        List<R> names = new ArrayList<>();
        for (Project project : projects) {
            if (predicate.test(project)) {
                names.add(function.apply(project));
            }
        }
        return names;
    }

}

interface ProjectFunction<R> extends Function<Project, R> {

    static ProjectFunction<Integer> buildStarFunction() {
        return Project::getStars;
    }
}