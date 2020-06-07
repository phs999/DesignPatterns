package phs999.tank;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Explode {
	private static int WIDTH=ResourceMgr.explodes[0].getWidth();
	private static int HEIGHT=ResourceMgr.explodes[0].getHeight();

	private int x, y;
	private boolean live=true;
	private TankFrame tf=null;
	private int step=0;
	public Explode(int x, int y,TankFrame tf) {
		this.x = x;
		this.y = y;
		this.tf=tf;
	}
	public static int getWIDTH() {
		return WIDTH;
	}
	
	public static int getHEIGHT() {
		return HEIGHT;
	}
	
	public void paint(Graphics g) {
		g.drawImage(ResourceMgr.explodes[step++], x, y, null);
		
		if (step>=ResourceMgr.explodes.length) {
			step=0;
		}
	}
	
	
}
