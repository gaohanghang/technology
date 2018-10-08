package lession1.predicate;

import lession1.Project;
import lession1.ProjectPredicate;

/**
 * 按 star 数过滤
 *
 * @author: Gao HangHang
 * @date 2018/10/05
 */
public class ProjectStarPredicate implements ProjectPredicate {

    private Integer stars;

    public ProjectStarPredicate(Integer stars) {
        this.stars = stars;
    }

    @Override
    public boolean test(Project project) {
        return project.getStars() > stars;
    }

}
