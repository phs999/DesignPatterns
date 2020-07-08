package phs999.tank.abstractfactory;

import phs999.tank.Bullet;
import phs999.tank.Dir;
import phs999.tank.Group;
import phs999.tank.Tank;
import phs999.tank.TankFrame;

public class RectFactory extends GameFactory {

	@Override
	public BaseTank createTank(int x, int y, Dir dir, Group group, TankFrame tf) {
		return new Tank(x, y, dir, group, tf);
	}

	@Override
	public BaseExplode createExplode(int x, int y, TankFrame tf) {
		return new RectExplode(y, y, tf);
	}

	@Override
	public BaseBullet createBullet(int x, int y, Dir dir, Group group, TankFrame tf) {
		return new RectBullet(x, y, dir, group, tf);
	}

}
