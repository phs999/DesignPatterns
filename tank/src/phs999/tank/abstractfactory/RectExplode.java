package phs999.tank.abstractfactory;

import java.awt.Color;
import java.awt.Graphics;

import phs999.tank.Audio;
import phs999.tank.ResourceMgr;
import phs999.tank.TankFrame;

public class RectExplode extends BaseExplode {
	private static int WIDTH=ResourceMgr.explodes[0].getWidth();
	private static int HEIGHT=ResourceMgr.explodes[0].getHeight();

	private int x, y;
	private TankFrame tf=null;
	private int step=0;
	public RectExplode(int x, int y,TankFrame tf) {
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
		Color color=g.getColor();
		g.setColor(Color.RED);
		g.fillRect(x, y, 10*step, 10*step);
		//g.drawImage(ResourceMgr.explodes[step++], x, y, null);
		step++;
		if (step>=10) {
			tf.explodes.remove(this);
		}
		g.setColor(color);
	}

}
