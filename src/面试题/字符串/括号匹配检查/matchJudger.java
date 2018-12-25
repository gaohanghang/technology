package 面试题.字符串.括号匹配检查;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author GaoHangHang
 * @date 2018/06/04 11:39
 **/
public class matchJudger {
    // pari以右括号为key,左括号为值
    private Map<Character, Character> pair = null;

    public matchJudger() {
        pair = new HashMap<>();
        pair.put(')', '(');
        pair.put('}', '{');
        pair.put(']', '[');
    }

    public boolean isMatch(String s) {
        Stack<Character> sc = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (pair.containsValue(ch)) {//如果是左括号，放入栈中
                sc.push(ch);
            } else if (pair.containsKey(ch)) {// 如果是右括号
                if (sc.empty()) { // 栈为空，栈头没有字符与右括号匹配
                    return false;
                }
                // 栈不为空
                if (sc.peek() == pair.get(ch)) {
                    sc.pop();
                } else { // 网上许多列子没有这里的else代码块，导致({}[]]])会被判断为true
                    // 栈不为空，栈头字符不与右括号匹配
                    return false;
                }
            }
        }

        return sc.empty() ? true : false;
    }


    public static void main(String[] args) {
        matchJudger judger = new matchJudger();
        System.out.println(judger.isMatch("(***)-[{-------}]")); //true
        System.out.println(judger.isMatch("(2+4)*a[5]")); //true
        System.out.println(judger.isMatch("({}[]]])")); //false
        System.out.println(judger.isMatch("())))")); //false
    }
}

