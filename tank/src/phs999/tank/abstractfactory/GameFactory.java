package phs999.tank.abstractfactory;

import phs999.tank.Dir;
import phs999.tank.Group;
import phs999.tank.TankFrame;

public abstract class GameFactory {
	public abstract BaseTank createTank(int x,int y,Dir dir,Group group,TankFrame tf);
	public abstract BaseExplode createExplode(int x,int y,TankFrame tf);
	public abstract BaseBullet createBullet(int x,int y,Dir dir, Group group,TankFrame tf);
}
