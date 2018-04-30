package java知识.公众号.Java技术栈.a2017.a5_28try_finally;

/*
    1、不管try,finally都会执行；
    2、在try中return，在finally执行前会把结果保存起来，即使在finally中有修改也以try中保存的值为准，但如果是引用类型，修改的属性会以finally修改后的为准；
    3、如果try/finally都有return，直接返回finally中的return。
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
        System.out.println(test4());
    }

    private static int test1() {
        int i = 1;
        try{
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            i = 0;
        }
        return i;
    }

    private static int test2() {
        int i = 1;
        try{
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            i = 0;
            return i;
        }
    }

    private static User test3() {
       User user = new User("u1");
       try{
           return user;
       } catch (Exception e){
           e.printStackTrace();
       }finally {
           user = new User("u2");
       }
       return null;
    }

    private static User test4() {
        User user = new User("u1");
        try {
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            user.setName("u2");
        }

        return null;

    }
}
