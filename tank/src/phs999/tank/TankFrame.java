package phs999.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

	int x = 200, y = 200;

	public TankFrame() {
		setSize(800, 600);// 像素px
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

	@Override
	public void paint(Graphics g) {
		// System.out.println("paint");
		g.fillRect(x, y, 50, 50);
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
			if (bL) {
				x-=10;
			}
			if (bR) {
				x+=10;
			}
			if (bU) {
				y-=10;
			}
			if (bD) {
				y+=10;
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
		
		}
	}
	
	
}
