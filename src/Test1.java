import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/11/14 2:48 PM
 */
public class Test1 {
    public static void main(String[] args) {

        List<Abc> arrayList = new ArrayList<Abc>();

        Abc abc1 = new Abc(1,true);
        Abc abc2 = new Abc(2,false);
        Abc abc3 = new Abc(3,true);
        arrayList.add(abc1);
        arrayList.add(abc2);
        arrayList.add(abc3);

        System.out.println(arrayList);

        //排序，true排前面
        Collections.sort(arrayList, new Comparator<Abc>() {
            @Override
            public int compare(Abc abc1, Abc abc2) {
                return Boolean.compare(abc2.isClickable,abc1.isClickable);
            }
        });


        System.out.println(arrayList);
    }
}
