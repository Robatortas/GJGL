package game.jam.graphics.library.project;

import java.awt.Dimension;

import game.jam.graphics.library.core.gjwl.GJWL;

public class DisplayManager {
	
	public GJWL gjwl = new GJWL();
	
	public DisplayManager(String title, int width, int height, EngineManager engine) {
		
		Dimension size = gjwl.createDimension(width, height);
		
		gjwl.setTitle(title);
		gjwl.pack();
		gjwl.add(engine);
		gjwl.setSize(size);
		gjwl.setLocationRelativeTo(null);
		gjwl.visible(true);
		engine.start();
		
		gjwl.closeFrame();
	}
}
