package structural.proxy.tankExample.dynamicPorxy;


import java.lang.reflect.Proxy;


public class DynamicProxyMain {

    public static void main(String[] args) {

        Tank tank = new Tank();
        //将程序运行过程中动态生成的代理类保存为文件
        //System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

     /*   Movable m = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class}, //tank.class.getInterfaces()
                new TimeProxy(tank)
        );
*/
        Movable m = (Movable) new TimeProxy(tank).bind();

        m.move();
    }
}



