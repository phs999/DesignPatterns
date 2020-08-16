package structural.proxy.tankExample.dynamicPorxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TimeProxy implements InvocationHandler {
    Movable m;

    public TimeProxy(Movable m) {
        this.m = m;
    }

    public void before() {
        System.out.println("method start..");
    }

    public void after() {
        System.out.println("method stop..");
    }

    public Object bind(){
           return Proxy.newProxyInstance(m.getClass().getClassLoader(),
                m.getClass().getInterfaces(),
               this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Arrays.stream(proxy.getClass().getMethods()).map(Method::getName).forEach(System.out::println);

        before();
        Object o = method.invoke(m, args);
        after();
        return o;
    }

}
