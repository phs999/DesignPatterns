package phs999.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame{
	
	int x=200,y=200;
	public TankFrame() {
		setSize(800,600);//像素px
		setResizable(false);//禁止改变大小
		setTitle("tank war");
		setVisible(true);//设置可见性
		addKeyListener(new MykeyListener());
		//设置关闭
		addWindowListener(new WindowAdapter() {
			/**
			 * Invoked when a window is in the process of being closed.
			 * The close operation can be overridden at this point.
			 *
			 * @param e
			 */
			@Override
			public void windowClosing(WindowEvent e) {
				//super.windowClosing(e);
				System.exit(0);
			}
		});
	}

	
	@Override
	public void paint(Graphics g) {
		//System.out.println("paint");
		g.fillRect(x,y, 50, 50);
		x+=10;
		y+=10;
	}
	
	class MykeyListener extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("key pressed");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("key released");

		}
		
	}
}
