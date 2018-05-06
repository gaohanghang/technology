package 基础知识.设计模式达内.代理模式;

public class UserImpl2 implements User{
    User us = new UserImpl();
    @Override
    public void saveUser(String user) {
        System.out.println("start");
        us.saveUser("中国万岁");
        System.out.println("end");
    }
}
