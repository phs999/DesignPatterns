package phs999.tank.cor;

import phs999.tank.Bullet;
import phs999.tank.GameObject;
import phs999.tank.Group;
import phs999.tank.Tank;
import phs999.tank.Wall;

public class TankWallCollider implements Collider {

	@Override
	public boolean collide(GameObject o1, GameObject o2) {
		if (o1 instanceof Tank && o2 instanceof Wall) {
			Tank t1 = (Tank)o1;
			Wall w = (Wall)o2;
			if (t1.getRect().intersects(w.getRect())) {
				if (t1.getGroup().equals(Group.BAD)) {
					t1.back();
				}else {
					t1.stop();
				}
			}
			return false;
			
		}else {
			return false;
		}
	}

}
