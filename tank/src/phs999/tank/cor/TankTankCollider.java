package phs999.tank.cor;

import phs999.tank.Bullet;
import phs999.tank.GameObject;
import phs999.tank.Group;
import phs999.tank.Tank;

public class TankTankCollider implements Collider {

	@Override
	public boolean collide(GameObject o1, GameObject o2) {
		if (o1 instanceof Tank && o2 instanceof Tank) {
			Tank t1 = (Tank)o1;
			Tank t2 = (Tank)o2;
			if (t1.getRect().intersects(t2.getRect())) {//坦克相交，敌方坦克反转方向
				t1.back();
				t2.back();
				/*
				 * if (t1.getGroup().equals(Group.BAD)) { t1.randomDir(); } if
				 * (t2.getGroup().equals(Group.BAD)) { t2.randomDir(); }
				 */
			}
			return false;
			
		}else {
			return false;
		}
	}

}
