package phs999.tank;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Tank {
	private int x, y;
	private Dir dir = Dir.UP;
	private boolean moving = false;//默认坦克不自动移动
	private static final int speed = 5;
	private static int WIDTH=ResourceMgr.goodTankD.getWidth();
	private static int HEIGHT=ResourceMgr.goodTankD.getHeight();
	private TankFrame tf=null;
	private boolean live=true;
	private Group group=Group.BAD;
	private Random random=new Random();
	Rectangle rect=new Rectangle();
	FireSrategy fs;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public static int getWIDTH() {
		return WIDTH;
	}
	
	public static int getHEIGHT() {
		return HEIGHT;
	}
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public Dir getDir() {
		return dir;
	}

	public void setDir(Dir dir) {
		this.dir = dir;
	}

	public Tank(int x, int y, Dir dir,Group group,TankFrame tf) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.group=group;
		this.tf=tf;
		if (group.equals(Group.BAD)) {
			moving=true;
		}
		rect.x=x;
		rect.y=y;
		rect.width=WIDTH;
		rect.height=HEIGHT;
	}

	public void paint(Graphics g) {
		if (!live&&this.group.equals(Group.BAD)) {
			tf.enemyTanks.remove(this);
			return;
		}
		if (group.equals(Group.BAD)) {
			switch (dir) {
			case LEFT:
				g.drawImage(ResourceMgr.badTankL, x, y, null);
				break;
			case RIGHT:
				g.drawImage(ResourceMgr.badTankR, x, y, null);
				break;
			case UP:
				g.drawImage(ResourceMgr.badTankU, x, y, null);
				break;
			case DOWN:
				g.drawImage(ResourceMgr.badTankD, x, y, null);
				break;
			default:
				break;
			}
			
			fire(RandomFireStrategy.getFireStrategy());
		}else {
			switch (dir) {
			case LEFT:
				g.drawImage(ResourceMgr.goodTankL, x, y, null);
				break;
			case RIGHT:
				g.drawImage(ResourceMgr.goodTankR, x, y, null);
				break;
			case UP:
				g.drawImage(ResourceMgr.goodTankU, x, y, null);
				break;
			case DOWN:
				g.drawImage(ResourceMgr.goodTankD, x, y, null);
				break;
			default:
				break;
			}
		}
		
		move();
	}

	private void move() {
		if (!moving) {
			return;
		}
		randomDir();
		switch (dir) {
		case LEFT:
			x -= speed;
			break;
		case RIGHT:
			x += speed;
			break;
		case UP:
			y -= speed;
			break;
		case DOWN:
			y += speed;
			break;

		default:
			break;
		}
		
		boundsCheck();
		rect.x=x;
		rect.y=y;
		
	}
	void fire(FireSrategy fs) {
		fs.fire(this);
	}

	private void boundsCheck() {
		if (x<0) {
			x=0;
		}
		if (x>TankFrame.GAME_WIDTH-this.WIDTH) {
			x=TankFrame.GAME_WIDTH-this.WIDTH;
		}
		if (y<30) {
			y=30;
		}
		if (y>TankFrame.GAME_HEIGHT-this.HEIGHT) {
			y=TankFrame.GAME_HEIGHT-this.HEIGHT;
		}
		
	}

	private void randomDir() {
		if (this.group.equals(Group.BAD)&&random.nextInt(100)>97) {
			this.dir=Dir.values()[random.nextInt(4)];
		}
	}

	public void die() {
		this.live=false;
		tf.explodes.add(new Explode(x, y, tf));
	}

	public TankFrame getTf() {
		return this.tf;
	}

}
