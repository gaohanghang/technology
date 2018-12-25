package lesson1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Gao HangHang
 * @date 2018/10/07
 */
public class java8 {

    public static void main(String[] args) {
        List<Project> projects = Project.buildDate();
        List<String> names = projects.stream()
                .filter(p -> {
                    System.out.println(p.getName());
                    return p.getStars() > 1000;
                })
                .map(p -> {
                    System.out.println(p.getName());
                    return p.getName();
                })
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(names);

        names.stream().forEach(name -> System.out.println(name));

    }

}
