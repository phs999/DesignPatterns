package phs999.tank;


public class FourDirFireStrategy implements FireSrategy{
	private static FireSrategy fireSrategy=new FourDirFireStrategy();
	
	private FourDirFireStrategy() {
	}
	
	public static FireSrategy getFireStrategy() {
		return fireSrategy;
	}

	@Override
	public void fire(Tank tank) {
		 int bX = tank.getX() + tank.getWIDTH()/2 - Bullet.getWIDTH()/2;
			int bY = tank.getY() + tank.getHEIGHT()/2 - Bullet.getHEIGHT()/2;
			
			Dir[] dirs=Dir.values();
			for (int i = 0; i < dirs.length; i++) {
				tank.getTf().gameFactory.createBullet(bX, bY, dirs[i], tank.getGroup(), tank.getTf());
			}
			if(tank.getGroup() == Group.GOOD) {
				new Thread(()->new Audio("audio/tank_fire.wav").play()).start();
			}
		
	}

}
