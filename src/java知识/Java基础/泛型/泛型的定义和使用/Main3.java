package java知识.Java基础.泛型.泛型的定义和使用;

import java.util.ArrayList;
import java.util.List;

public class Main3 {


    public static void main(String[] args) {

        Sub sub = new Sub();
        Base base = sub;

        List<Sub> lsub = new ArrayList<>();
        //List<Base> lbase = lsub;

    }

}

class Base{}

class Sub extends  Base{};

