package structural.proxy.tankExample.staticPorxy;

public class TankLogProxy implements Movable {
    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("stopped!");
    }
}

