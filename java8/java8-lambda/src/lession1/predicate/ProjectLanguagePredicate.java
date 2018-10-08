package lession1.predicate;

import lession1.Project;
import lession1.ProjectPredicate;

/**
 * 按编程语言过滤
 *
 * @author: Gao HangHang
 * @date 2018/10/05
 */
public class ProjectLanguagePredicate implements ProjectPredicate {

    private String language;

    public ProjectLanguagePredicate(String language) {
        this.language = language;
    }


    @Override
    public boolean test(Project project) {
        return language.equals(project.getLanguage());
    }
}
