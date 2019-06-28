package game;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JPanel {
	JFrame frame;
	
	void setup() {
		frame = new JFrame();
		frame.add(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setPreferredSize(new Dimension(1280,800));
		
		frame.pack();
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Window().setup();
	}
}
