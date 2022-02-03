package game.jam.graphics.library.core.gjwl;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GJWL {
	
	private JFrame frame = new JFrame();
	
	// Creates new Dimension for window
	public Dimension createDimension(int width, int height) {
		Dimension dimension = new Dimension(width, height);
		return dimension;
	}
	
	// Sets GJWL window title
	public void setTitle(String title) {
		frame.setTitle(title);
	}

	public void setLocation(int x, int y) {
		frame.setLocation(x, y);
	}
	public void setLocationRelativeTo(Component component) {
		frame.setLocationRelativeTo(component);
	}
	
	// Size setting
	public void setSize(Dimension dimension) {
		frame.setSize(dimension);
	}
	public void setSize(int width, int height) {
		frame.setSize(width, height);
	}
	
	// Sets visibility
	public void visible(boolean visibility) {
		frame.setVisible(visibility);
	}
	
	public void add(Component component) {
		frame.add(component);
	}
	
	
	// Packs the contents in the window
	public void pack() {
		frame.pack();
	}
	
	// Closes GJWL window
	public void closeFrame() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
