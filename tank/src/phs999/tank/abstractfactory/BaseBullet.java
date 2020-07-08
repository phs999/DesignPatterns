package phs999.tank.abstractfactory;

import java.awt.Graphics;

import phs999.tank.Tank;

public abstract class BaseBullet {
	public abstract void paint(Graphics g);

	public abstract void collideWith(Tank tank);

}
