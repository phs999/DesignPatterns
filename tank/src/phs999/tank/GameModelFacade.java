package phs999.tank;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class GameModelFacade {

	Tank myTank = new Tank(200, 400, Dir.UP,Group.GOOD,this);
	List<Bullet> bullets =new ArrayList<>();
	List<Tank> enemyTanks=new ArrayList<>();
	List<Explode> explodes=new ArrayList<>();

	public GameModelFacade() {
		 int initTankCount=Integer.parseInt((String)PropertyMgr.get("initTankCount"));
		 //初始化敌方坦克
		   for (int i = 0; i < initTankCount; i++) {
				enemyTanks.add(new Tank(50+80*i, 200, Dir.DOWN,Group.BAD, this));
			}
	}
	
	public void paint(Graphics g) {
		Color color=g.getColor();
		g.setColor(Color.WHITE);
		g.drawString("子弹数量："+bullets.size(), 10, 60);
		g.drawString("敌人数量："+enemyTanks.size(), 10, 80);
		g.drawString("爆炸数量："+explodes.size(), 10, 100);

		g.setColor(color);
		myTank.paint(g);
		for (int i = 0; i < bullets.size(); i++) {
			bullets.get(i).paint(g);
		}
		
		for (int i = 0; i < enemyTanks.size();i++) {
			enemyTanks.get(i).paint(g);
		}
		for (int i = 0; i <bullets.size(); i++) {
			for (int j = 0; j < enemyTanks.size(); j++) {
				bullets.get(i).collideWith(enemyTanks.get(j));
				
			}
			
		}
		for (int i = 0; i < explodes.size(); i++) {
			explodes.get(i).paint(g);
		}
		/*
		 * for (Bullet bullet : bullets) { bullet.paint(g); }
		 */
	}
	

	public Tank getMainTank() {
		return myTank;
	}
}
