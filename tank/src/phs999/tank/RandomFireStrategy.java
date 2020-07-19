package phs999.tank;

import java.util.Random;

/**
 * 针对Group.BAD的坦克，实现随机发射炮弹
 * @author phs
 *
 */
public class RandomFireStrategy implements FireSrategy{
	private static final FireSrategy randomFireStrategy=new RandomFireStrategy();
	private Random random=new Random();
	
	private RandomFireStrategy() {
	}
	
	public static FireSrategy getFireStrategy() {
		return randomFireStrategy;
	}
	@Override
	public void fire(Tank tank) {
		if (random.nextInt(100)>95) {
			int bX = tank.getX() + tank.getWIDTH()/2 - Bullet.getWIDTH()/2;
			int bY = tank.getY() + tank.getHEIGHT()/2 - Bullet.getHEIGHT()/2;
			
			new Bullet(bX, bY, tank.getDir(), tank.getGroup(), tank.getGm());
			
			if(tank.getGroup() == Group.GOOD) {
				new Thread(()->new Audio("audio/tank_fire.wav").play()).start();
			}
		}
		
	}

}
