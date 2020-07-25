package phs999.tank.cor;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import phs999.tank.GameObject;
import phs999.tank.PropertyMgr;

public class ColliderChain implements Collider {

	private List<Collider> colliders = new LinkedList<Collider>();

	public ColliderChain(){

		Object colliderString = PropertyMgr.get("colliders");
		if (colliderString != null && colliderString.equals("")) {
			String[] arr = colliderString.toString().split(",");
			for (int i = 0; i < arr.length; i++) {
				String string = arr[i];
				try {
					add((Collider) Class.forName(string).getDeclaredConstructor().newInstance());
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException
						| ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		add(new BulletTankCollider());
		add(new TankTankCollider());
	}

	public void add(Collider collider) {
		colliders.add(collider);

	}

	public boolean collide(GameObject o1, GameObject o2) {

		for (int i = 0; i < colliders.size(); i++) {
			boolean result = colliders.get(i).collide(o1, o2);
			if (result) {
				return true;
			}
		}
		return false;
	}

}
