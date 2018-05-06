package service;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;
import project.service.UserService;

import java.lang.reflect.Method;

public class TestCGLIB01 {

    public static void main(String[] args) {
        // 1. 构建目标对象
        UserService userService = new UserService();
        // 2. 创建代理对象
        // 2.1 创建增强器对象
        Enhancer e = new Enhancer();
        // 2.2 设置增强器的类加载器
        e.setClassLoader(userService.getClass().getClassLoader());
        // 2.3 设置代理对象父类类型
        e.setSuperclass(userService.getClass());
        // 2.4 设置回调函数
        e.setCallback(new InvocationHandler() {
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                return null;
            }
        });
    }
}
