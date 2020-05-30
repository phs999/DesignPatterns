package phs999.tank;

import java.awt.Graphics;

public class Tank {
	private int x, y;
	private Dir dir = Dir.DOWN;
	public Dir getDir() {
		return dir;
	}
	public void setDir(Dir dir) {
		this.dir = dir;
	}
	private static final int speed=10;
	public Tank(int x, int y, Dir dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
	public void paint(Graphics g) {
		g.fillRect(x, y, 50, 50);
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
