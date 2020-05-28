package phs999.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {
	 public static void main(String[] args) {
	        Frame f = new Frame();
	        f.setSize(800,600);//像素px
	        f.setResizable(false);//禁止改变大小
	        f.setTitle("tank war");
	        f.setVisible(true);//设置可见性
	        //设置关闭
	        f.addWindowListener(new WindowAdapter() {
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

}
