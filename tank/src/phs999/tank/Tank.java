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
		if (random.nextInt(100)>95&&this.group.equals(Group.BAD)) {
			this.fire();
		}
		move();
	}

	private void move() {
		if (!moving) {
			return;
		}
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
		
	}
	
	  public void fire() { 
		  int bX=0;//x+19;
		  int bY=0;//y+22;
		  switch (dir) {
		  case UP:
			bX=this.x+this.WIDTH/2-Bullet.getWIDTH()/3;
			bY=this.y;
			break;
		  case DOWN:
				bX=this.x+this.WIDTH/2-3*Bullet.getWIDTH()/5;
				bY=this.y+this.HEIGHT-Bullet.getHEIGHT();
				break;
		  case LEFT:
				bX=this.x;
				bY=this.y+this.HEIGHT/2-Bullet.getHEIGHT()/4;
				break;
		  case RIGHT:
				bX=this.x+this.WIDTH-Bullet.getWIDTH();
				bY=this.y+this.HEIGHT/2-Bullet.getHEIGHT()/4;
				break;
		default:
			break;
		}
			 		  
		  tf.bullets.add(new Bullet(bX, bY, dir,this.group,tf));
	  
	  }

	public void die() {
		this.live=false;
	}
	 

}
