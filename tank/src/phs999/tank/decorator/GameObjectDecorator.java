package phs999.tank.decorator;

import java.awt.Graphics;

import phs999.tank.GameObject;

public abstract class GameObjectDecorator extends GameObject{

	GameObject go;
	
	public GameObjectDecorator(GameObject go) {
		this.go=go;
	}
		
	@Override
	public void paint(Graphics g) {
		go.paint(g);
	}
	@Override
	public int getX() {
		return go.getX();
	}
	@Override
	public int getY() {
		return go.getY();
	}
	
}
