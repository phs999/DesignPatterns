package phs999.tank.cor;

import phs999.tank.Bullet;
import phs999.tank.GameObject;
import phs999.tank.Tank;
import phs999.tank.Wall;

public class BulletWallCollider implements Collider {

	@Override
	public boolean collide(GameObject o1, GameObject o2) {
		if (o1 instanceof Bullet && o2 instanceof Wall) {
			Bullet b = (Bullet)o1;
			Wall w = (Wall)o2;
			if (b.getRect().intersects(w.getRect())) {
				b.die();
			}
			
		}else if (o1 instanceof Wall && o2 instanceof Bullet) {
			collide(o2,o1);
		}else {
			return false;
		}
		return false;
	}

}
