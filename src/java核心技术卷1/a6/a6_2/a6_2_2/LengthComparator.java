package java核心技术卷1.a6.a6_2.a6_2_2;

import java.util.Comparator;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2018/12/24 16:15
 */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
