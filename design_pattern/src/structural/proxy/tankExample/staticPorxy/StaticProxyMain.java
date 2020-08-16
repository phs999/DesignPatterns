package structural.proxy.tankExample.staticPorxy;


import java.util.Random;

/**
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？
 * v05:使用代理
 * v06:代理有各种类型
 * 问题：如何实现代理的各种组合？继承？Decorator?
 * v07:代理的对象改成Movable类型-越来越像decorator了
 *
 */
public class StaticProxyMain {

    public static void main(String[] args) {

       Tank t = new Tank();
        TankLogProxy tlp = new TankLogProxy(t);
        tlp.move();

//        new TankLogProxy(
//                new TankTimeProxy(
//                        new Tank()
//                )
//        ).move();
    }
}



