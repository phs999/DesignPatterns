package phs999.tank.abstractfactory;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import phs999.tank.Dir;
import phs999.tank.Group;
import phs999.tank.ResourceMgr;
import phs999.tank.Tank;
import phs999.tank.TankFrame;
import phs999.tank.abstractfactory.BaseBullet;

public class RectBullet extends BaseBullet{
	private static final int speed=6;
	private static int WIDTH=ResourceMgr.bulletD.getWidth();
	private static int HEIGHT=ResourceMgr.bulletD.getHeight();

	private int x, y;
	private Dir dir;
	Rectangle rect=new Rectangle();
	private boolean live=true;//子弹活着则可以调用paint方法，遇到敌方坦克或者越界则子弹消失
	private Group group=Group.BAD;
	private TankFrame tf=null;
	public RectBullet(int x, int y, Dir dir,Group group,TankFrame tf) {
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.group=group;
		this.tf=tf;
		rect.x=x;
		rect.y=y;
		rect.width=WIDTH;
		rect.height=HEIGHT;
		tf.bullets.add(this);
	}
	public static int getWIDTH() {
		return WIDTH;
	}
	
	public static int getHEIGHT() {
		return HEIGHT;
	}
	@Override
	public void paint(Graphics g) {
		if (!live) {
			tf.bullets.remove(this);
			return;
		}
		Color color=g.getColor();
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, 10, 10);
		g.setColor(color);
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
		
		//update rect
		rect.x=x;
		rect.y=y;
		
		//子弹越界后不再进行绘制paint
		if (x<0||y<0||x>TankFrame.GAME_WIDTH||y>TankFrame.GAME_HEIGHT) {
			live=false;
		}
		
	}
	/**
	 * 判断子弹与坦克相交，子弹与坦克都消失
	 * @param tank
	 */
	public void collideWith(Tank tank) {
		if (this.group.equals(tank.getGroup())) {
			return;
		}
		if (rect.intersects(tank.rect)) {
			tank.die();
			this.die();
		}
		
	}
	private void die() {
		live=false;
	}
}
