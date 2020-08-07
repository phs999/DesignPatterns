package phs999.tank;

import java.awt.Graphics;

public class Explode extends GameObject{
	private static int WIDTH=ResourceMgr.explodes[0].getWidth();
	private static int HEIGHT=ResourceMgr.explodes[0].getHeight();

	private int x, y;
	private int step=0;
	public Explode(int x, int y) {
		this.x = x;
		this.y = y;
		new Thread(()->new Audio("audio/explode.wav").play()).start();
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
			GameModelFacade.getInstance().remove(this);
		}
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
