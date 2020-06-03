package phs999.tank;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet {
	private static final int speed=3;
	private static int WIDTH=10,HEIGHT=10;
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
	
	public void paint(Graphics g) {
		if (!live) {
			tf.bullets.remove(this);
			return;
		}
		Color color=g.getColor();
		g.setColor(Color.RED);
		g.fillOval(x, y, WIDTH,HEIGHT);
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
		
		if (x<0||y<0||x>TankFrame.GAME_WIDTH||y>TankFrame.GAME_HEIGHT) {
			live=false;
		}
		
	}
}
