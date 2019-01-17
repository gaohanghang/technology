package java知识.公众号.Java识堂._2019.a1_2final关键字;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/17 19:21
 */
public class PersonallLoan {
    public final String getName() {
        return "personal loan";
    }
}

class CheapPersonalLoan extends PersonallLoan {
    // public final String getName() {
    //     return "cheap personal loan"; // compilation error;
    // }
}
