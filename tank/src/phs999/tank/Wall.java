package phs999.tank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Wall extends GameObject{
	private static int WIDTH=ResourceMgr.bulletD.getWidth();
	private static int HEIGHT=ResourceMgr.bulletD.getHeight();

	private int x, y;
	private int w,h;
	Rectangle rect;
	private GameModelFacade gm=null;
	public Rectangle getRect() {
		return rect;
	}
	public Wall(int x, int y, int w,int h) {
		this.x = x;
		this.y = y;
		this.w=w;
		this.h=h;
		rect=new Rectangle(x,y,w,h);
		/*
		 * rect.x=x; rect.y=y; rect.width=WIDTH; rect.height=HEIGHT; gm.add(this);
		 */
	}
	
	
	public void paint(Graphics g) {
		Color color=g.getColor();
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x, y, w, h);
		g.setColor(color);
	}
	
}