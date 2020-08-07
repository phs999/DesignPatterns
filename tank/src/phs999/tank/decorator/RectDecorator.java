package phs999.tank.decorator;

import java.awt.Color;
import java.awt.Graphics;

import phs999.tank.GameObject;

public class RectDecorator extends GameObjectDecorator{

	public RectDecorator(GameObject go) {
		super(go);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Color color=g.getColor();
		g.setColor(Color.YELLOW);
		g.drawRect(getX(), getY(), getWidth()+1, getHeight()+1);
	}
	

	@Override
	public int getWidth() {
		return go.getWidth();
	}

	@Override
	public int getHeight() {
		return go.getHeight();
	}
	
}
