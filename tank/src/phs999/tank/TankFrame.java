package phs999.tank;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

	Tank tank = new Tank(200, 200, Dir.DOWN);
	Bullet bullet =new Bullet(300, 300, Dir.DOWN);
	static final int GAME_WIDTH=800,GAME_HEIGHT=600;
	
	public TankFrame() {
		setSize(GAME_WIDTH, GAME_HEIGHT);// 像素px
		setResizable(false);// 禁止改变大小
		setTitle("tank war");
		setVisible(true);// 设置可见性
		addKeyListener(new MykeyListener());
		// 设置关闭
		addWindowListener(new WindowAdapter() {
			/**
			 * Invoked when a window is in the process of being closed. The close operation
			 * can be overridden at this point.
			 *
			 * @param e
			 */
			@Override
			public void windowClosing(WindowEvent e) {
				// super.windowClosing(e);
				System.exit(0);
			}
		});
	}
	
	Image offScreenImage = null;

	@Override
	public void update(Graphics g) {
		if (offScreenImage == null) {
			offScreenImage = this.createImage(GAME_WIDTH, GAME_HEIGHT);
		}
		Graphics gOffScreen = offScreenImage.getGraphics();
		Color c = gOffScreen.getColor();
		gOffScreen.setColor(Color.BLACK);
		gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
		gOffScreen.setColor(c);
		paint(gOffScreen);
		g.drawImage(offScreenImage, 0, 0, null);
	}

	@Override
	public void paint(Graphics g) {
		tank.paint(g);
		bullet.paint(g);
		//x += 10;
	}

	class MykeyListener extends KeyAdapter {

		boolean bL=false;
		boolean bR=false;
		boolean bU=false;
		boolean bD=false;
		
		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_LEFT:
				bL=true;
				break;
			case KeyEvent.VK_RIGHT:
				bR=true;
				break;
			case KeyEvent.VK_UP:
				bU=true;
				break;
			case KeyEvent.VK_DOWN:
				bD=true;
				break;

			default:
				break;
			}
			// x+=200;
			// y+=10;
			// repaint();
			setMainTankDir();
			/*
			 * if (bL) { x-=10; } if (bR) { x+=10; } if (bU) { y-=10; } if (bD) { y+=10; }
			 */
		}

		private void setMainTankDir() {
			if (!bL && !bR && !bU && !bD) {
				tank.setMoving(false);
			}else {
				tank.setMoving(true);
				if (bL) {
					tank.setDir(Dir.LEFT);
				}
				if (bR) {
					tank.setDir(Dir.RIGHT);
				}
				if (bU) {
					tank.setDir(Dir.UP);
				}
				if (bD) {
					tank.setDir(Dir.DOWN);
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_LEFT:
				bL=false;
				break;
			case KeyEvent.VK_RIGHT:
				bR=false;
				break;
			case KeyEvent.VK_UP:
				bU=false;
				break;
			case KeyEvent.VK_DOWN:
				bD=false;
				break;

			default:
				break;
			}
			setMainTankDir();
		
		}
	}
	
	
}
