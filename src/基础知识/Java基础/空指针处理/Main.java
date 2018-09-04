package 基础知识.Java基础.空指针处理;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/02 23:42
 */
public class Main {

    public static void main(String[] args) {

        //Outer outer = new Outer();
        //
        //if (outer != null && outer.nested != null && outer.nested.inner !=null){
        //
        //    System.out.println(outer.nested.inner.foo);
        //
        //}

        // 非空判断
        //Optional.of(new Outer()).map(Outer::getNested).map(Nested::getInner).map(Inner::getFoo).ifPresent(System.out::println);

        Outer obj = new Outer();

        resolve(() -> obj.getNested().getInner().getFoo()).ifPresent(System.out::println);

    }

    public static<T>Optional<T> resolve(Supplier<T> resolver) {

        try {

            T resilt = resolver.get();

            return Optional.ofNullable(resilt);

        } catch (NullPointerException e) {

            return Optional.empty();

        }
    }

}

class Outer {

    Nested nested;

    Nested getNested() {

        return nested;

    }

}

class Nested {

    Inner inner;

    Inner getInner(){

        return inner;

    }

}

class Inner {

    String foo;

    String getFoo() {

        return foo;

    }

}
