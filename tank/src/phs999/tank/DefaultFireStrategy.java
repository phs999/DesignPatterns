package phs999.tank;

/**
 * 坦克默认的发射炮弹策略
 * @author phs
 *
 */
public class DefaultFireStrategy implements FireSrategy{
	private static FireSrategy  fireSrategy= new DefaultFireStrategy();
	private DefaultFireStrategy() {
	}
	public static FireSrategy getFireStrategy() {
		return fireSrategy;
	}

	@Override
	 public void fire(Tank tank) { 
		  int bX = tank.getX() + tank.getWIDTH()/2 - Bullet.getWIDTH()/2;
			int bY = tank.getY() + tank.getHEIGHT()/2 - Bullet.getHEIGHT()/2;
			
			new Bullet(bX, bY, tank.getDir(), tank.getGroup());
			
			if(tank.getGroup() == Group.GOOD) {
				new Thread(()->new Audio("audio/tank_fire.wav").play()).start();
			}
	  
	  }
	
}
