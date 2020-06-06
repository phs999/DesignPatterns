package phs999.tank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet {
	private static final int speed=3;
	private static int WIDTH=ResourceMgr.bulletD.getWidth();
	private static int HEIGHT=ResourceMgr.bulletD.getHeight();

	private int x, y;
	private Dir dir;
	private boolean live=true;
	private TankFrame tf=null;
	public Bullet(int x, int y, Dir dir,TankFrame tf) {
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.tf=tf;
	}
	public static int getWIDTH() {
		return WIDTH;
	}
	
	public static int getHEIGHT() {
		return HEIGHT;
	}
	
	public void paint(Graphics g) {
		if (!live) {
			tf.bullets.remove(this);
			return;
		}
		switch (dir) {
		case LEFT:
			g.drawImage(ResourceMgr.bulletL, x, y, null);
			break;
		case RIGHT:
			g.drawImage(ResourceMgr.bulletR, x, y, null);
			break;
		case UP:
			g.drawImage(ResourceMgr.bulletU, x, y, null);
			break;
		case DOWN:
			g.drawImage(ResourceMgr.bulletD, x, y, null);
			break;
		default:
			break;
		}
		move();
	}
	
	private void move() {
		switch (dir) {
		case LEFT:
			x-=speed;
			break;
		case RIGHT:
			x+=speed;
			break;
		case UP:
			y-=speed;
			break;
		case DOWN:
			y+=speed;
			break;

		default:
			break;
		}
		
		if (x<0||y<0||x>TankFrame.GAME_WIDTH||y>TankFrame.GAME_HEIGHT) {
			live=false;
		}
		
	}
	/**
	 * 判断子弹与坦克相交，子弹与坦克都消失
	 * @param tank
	 */
	public void collideWith(Tank tank) {
		Rectangle rect1=new Rectangle(this.x, this.y, this.WIDTH, this.HEIGHT);
		Rectangle rect2=new Rectangle(tank.getX(), tank.getY(), tank.getWIDTH(), tank.getHEIGHT());
		if (rect1.intersects(rect2)) {
			tank.die();
			this.die();
		}
		
	}
	private void die() {
		live=false;
	}
}
