package game.jam.graphics.library.core;

import java.awt.Canvas;

import game.jam.graphics.library.core.create.GameLoop;

public class EngineManager extends Canvas implements Runnable {

	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	public GJGL gjgl;
	
	private DisplayManager display;
	
	public EngineManager() { 
		display = new DisplayManager();
	}
	
	public void start() {
		gjgl.start();
	}
	
	public synchronized void stop() {
		gjgl.stop();
	}
	
	public void run() {
		gjgl.loop();
	}
	
	public void update() {
		
	}
	
	public void render() {
		
	}
}
