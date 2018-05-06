package 基础知识.设计模式达内.代理模式;

public class UserImpl implements User{
    @Override
    public void saveUser(String user) {
        System.out.println(user);
    }
}
