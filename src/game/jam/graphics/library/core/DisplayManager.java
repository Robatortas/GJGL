package game.jam.graphics.library.core;

import java.awt.Dimension;

import game.jam.graphics.library.core.gjwl.GJWL;

public class DisplayManager {
	
	public GJWL gjwl;
	
	public DisplayManager(String title, int width, int height) {
		
		Dimension size = gjwl.createDimension(width, height);
		
		gjwl.frame.setTitle(title);
		gjwl.frame.setSize(size);
		gjwl.frame.setVisible(true);
		
		gjwl.closeFrame();
	}
}
