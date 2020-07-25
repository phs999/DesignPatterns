package phs999.tank.cor;

import phs999.tank.Bullet;
import phs999.tank.GameObject;
import phs999.tank.Tank;

public class BulletTankCollider implements Collider {

	@Override
	public boolean collide(GameObject o1, GameObject o2) {
		if (o1 instanceof Bullet && o2 instanceof Tank) {
			Bullet b = (Bullet)o1;
			Tank t = (Tank)o2;
			if (b.getGroup().equals(t.getGroup())) {
				return false;
			}
			if (b.getRect().intersects(t.getRect())) {
				t.die();
				b.die();
				return true;
			}
			
		}else if (o1 instanceof Tank && o2 instanceof Bullet) {
			collide(o2,o1);
		}else {
			return false;
		}
		return false;
	}

}
