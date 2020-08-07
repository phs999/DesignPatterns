package phs999.tank;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import phs999.tank.cor.ColliderChain;
import phs999.tank.decorator.RectDecorator;

public class GameModelFacade {
	private static GameModelFacade gm=new GameModelFacade();

	Tank myTank = new Tank(200, 400, Dir.UP,Group.GOOD);
	/*
	 * List<Bullet> bullets =new ArrayList<>(); List<Tank> enemyTanks=new
	 * ArrayList<>(); List<Explode> explodes=new ArrayList<>();
	 */
	private List<GameObject> objects=new ArrayList<GameObject>();
//	Collider collider1=new BulletTankCollider();
//	Collider collider2=new TankTankCollider();
	ColliderChain chain=new ColliderChain();
	
	private GameModelFacade() {
		 int initTankCount=Integer.parseInt((String)PropertyMgr.get("initTankCount"));
		 //初始化敌方坦克
		   for (int i = 0; i < initTankCount; i++) {
			   add(new Tank(40+80*i, 200, Dir.DOWN,Group.BAD));
			}
		   add(myTank);
		   add(new RectDecorator(new Wall(150, 150, 200, 50)));
		   add(new Wall(550, 150, 200, 50));
		   add(new Wall(300, 300, 50, 200));
		   add(new Wall(550, 300, 50, 200));
	}
	
	public static GameModelFacade getInstance() {
		return gm;
	}
	
	public void paint(Graphics g) {
		myTank.paint(g);
		for (int i = 0; i < objects.size(); i++) {
			objects.get(i).paint(g);
		}
		
		//碰撞检测
		  for (int i = 0; i <objects.size(); i++) { 
			  //collider2.collide(objects.get(i), myTank);
			  for (int j = i+1; j < objects.size();j++) { 
				  chain.collide(objects.get(i), objects.get(j));
				  //collider1.collide(objects.get(i), objects.get(j));//子弹坦克
				  //collider2.collide(objects.get(i), objects.get(j));//坦克坦克
			  } 
		  }
		 
		
	}
	
	
	public void add(GameObject go) {
		objects.add(go);
	}
	
	public void remove(GameObject go) {
		objects.remove(go);
	}

	public Tank getMainTank() {
		return myTank;
	}
}
