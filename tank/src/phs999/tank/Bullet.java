package phs999.tank;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet {
	private static final int speed=10;
	private static int WIDTH=5,HEIGHT=5;
	private int x, y;
	private Dir dir;
	public Bullet(int x, int y, Dir dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
	
	public void paint(Graphics g) {
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
		
	}
}
