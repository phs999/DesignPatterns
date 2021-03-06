package phs999.tank;

import java.awt.Graphics;
import java.awt.Rectangle;

import phs999.tank.abstractfactory.BaseExplode;

public class Explode extends BaseExplode{
	private static int WIDTH=ResourceMgr.explodes[0].getWidth();
	private static int HEIGHT=ResourceMgr.explodes[0].getHeight();

	private int x, y;
	private TankFrame tf=null;
	private int step=0;
	public Explode(int x, int y,TankFrame tf) {
		this.x = x;
		this.y = y;
		this.tf=tf;
		new Thread(()->new Audio("audio/explode.wav").play()).start();
	}
	public static int getWIDTH() {
		return WIDTH;
	}
	
	public static int getHEIGHT() {
		return HEIGHT;
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(ResourceMgr.explodes[step++], x, y, null);
		
		if (step>=ResourceMgr.explodes.length) {
			tf.explodes.remove(this);
		}
	}
	
	
}
