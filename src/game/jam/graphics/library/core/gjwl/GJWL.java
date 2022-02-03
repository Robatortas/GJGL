package game.jam.graphics.library.core.gjwl;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GJWL {
	
public JFrame frame;
	
	// Creates new Dimension for window
	public Dimension createDimension(int width, int height) {
		Dimension dimension = new Dimension(width, height);
		return dimension;
	}
	
	// Sets GJWL window title
	public void setTitle(String title) {
		frame.setTitle(title);
	}
	
	// Closes GJWL window
	public void closeFrame() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
