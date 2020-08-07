package phs999.tank;

import java.awt.Graphics;

public abstract class GameObject {
	
	protected int x,y;
	public abstract void paint(Graphics g);
	public abstract int getWidth();
	public abstract int getHeight();
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

}
