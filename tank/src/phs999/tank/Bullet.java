package phs999.tank;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends GameObject{
	private static final int speed=6;
	private static int WIDTH=ResourceMgr.bulletD.getWidth();
	private static int HEIGHT=ResourceMgr.bulletD.getHeight();

	private Dir dir;
	Rectangle rect=new Rectangle();
	private boolean live=true;//子弹活着则可以调用paint方法，遇到敌方坦克或者越界则子弹消失
	private Group group=Group.BAD;
	public Rectangle getRect() {
		return rect;
	}
	public Group getGroup() {
		return group;
	}
	public Bullet(int x, int y, Dir dir,Group group) {
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.group=group;
		rect.x=x;
		rect.y=y;
		rect.width=WIDTH;
		rect.height=HEIGHT;
		GameModelFacade.getInstance().add(this);
	}
	public static int getWIDTH() {
		return WIDTH;
	}
	
	public static int getHEIGHT() {
		return HEIGHT;
	}
	
	public void paint(Graphics g) {
		if (!live) {
			GameModelFacade.getInstance().remove(this);
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
//	public void collideWith(Tank tank) {
//		if (this.group.equals(tank.getGroup())) {
//			return;
//		}
//		if (rect.intersects(tank.rect)) {
//			tank.die();
//			this.die();
//		}
//		
//	}
	public void die() {
		live=false;
	}
	@Override
	public int getWidth() {
		return WIDTH;
	}
	@Override
	public int getHeight() {
		return HEIGHT;
	}
}
