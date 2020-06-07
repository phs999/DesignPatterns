package phs999.tank;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Tank {
	private int x, y;
	private Dir dir = Dir.UP;
	private boolean moving = false;
	private static final int speed = 5;
	private static int WIDTH=ResourceMgr.tankD.getWidth();
	private static int HEIGHT=ResourceMgr.tankD.getHeight();
	private TankFrame tf=null;
	private boolean live=true;
	private Group group=Group.BAD;
	private Random random=new Random();
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public static int getWIDTH() {
		return WIDTH;
	}
	
	public static int getHEIGHT() {
		return HEIGHT;
	}
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public Dir getDir() {
		return dir;
	}

	public void setDir(Dir dir) {
		this.dir = dir;
	}

	public Tank(int x, int y, Dir dir,Group group,TankFrame tf) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.group=group;
		this.tf=tf;
		if (group.equals(Group.BAD)) {
			moving=true;
		}
	}

	public void paint(Graphics g) {
		if (!live&&this.group.equals(Group.BAD)) {
			tf.enemyTanks.remove(this);
			return;
		}
		switch (dir) {
		case LEFT:
			g.drawImage(ResourceMgr.tankL, x, y, null);
			break;
		case RIGHT:
			g.drawImage(ResourceMgr.tankR, x, y, null);
			break;
		case UP:
			g.drawImage(ResourceMgr.tankU, x, y, null);
			break;
		case DOWN:
			g.drawImage(ResourceMgr.tankD, x, y, null);
			break;
		default:
			break;
		}
		move();
	}

	private void move() {
		if (!moving) {
			return;
		}
		randomDir();
		switch (dir) {
		case LEFT:
			x -= speed;
			break;
		case RIGHT:
			x += speed;
			break;
		case UP:
			y -= speed;
			break;
		case DOWN:
			y += speed;
			break;

		default:
			break;
		}
		if (random.nextInt(100)>95&&this.group.equals(Group.BAD)) {
			this.fire();
		}
		
	}
	private void randomDir() {
		if (random.nextInt(100)>97&&this.group.equals(Group.BAD)) {
			this.dir=Dir.values()[random.nextInt(4)];
		}
	}
	  public void fire() { 
		  int bX = this.x + Tank.WIDTH/2 - Bullet.getWIDTH()/2;
			int bY = this.y + Tank.HEIGHT/2 - Bullet.getHEIGHT()/2;
			
			tf.bullets.add(new Bullet(bX, bY, this.dir, this.group, this.tf));
			
			if(this.group == Group.GOOD) {
				new Thread(()->new Audio("audio/tank_fire.wav").play()).start();
			}
	  
	  }

	public void die() {
		this.live=false;
		tf.explodes.add(new Explode(x, y, tf));
	}
	 

}
