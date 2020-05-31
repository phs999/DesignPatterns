package phs999.tank;

import java.awt.Color;
import java.awt.Graphics;

public class Tank {
	private int x, y;
	private Dir dir = Dir.DOWN;
	private boolean moving = false;
	private static final int speed = 5;
	private TankFrame tf=null;

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

	public Tank(int x, int y, Dir dir,TankFrame tf) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.tf=tf;
	}

	public void paint(Graphics g) {
		Color color = g.getColor();
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, 50, 50);
		g.setColor(color);
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
		  tf.bullet=new Bullet(x+25, y, dir);
	  
	  }
	 

}
