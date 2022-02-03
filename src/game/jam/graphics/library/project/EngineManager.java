package game.jam.graphics.library.project;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import game.jam.graphics.library.core.gjgl.GJGL;

public class EngineManager extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 720;
	public static final int HEIGHT = 500;
	
	public static final String TITLE = "GJGL";
	
	public GJGL gjgl = new GJGL();
	
	private DisplayManager display;
	
	public EngineManager() { 
		display = new DisplayManager(TITLE, WIDTH, HEIGHT, this);
	}
	
	public void start() {
		gjgl.start();
	}
	
	public synchronized void stop() {
		gjgl.stop();
	}
	
	public void run() {
		gjgl.loop();
		
		System.out.println("running");
		
		while(gjgl.running) {
			render();
			update();
			System.out.println("running");
		}
	}
	
	public void update() {
		System.out.println("update!");
	}
	
	public void render() {
		BufferStrategy bs = gjgl.createBufferStrategy();
		gjgl.startBufferStrategy(bs);
		
		Graphics g = gjgl.getGraphics(bs);
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
	}
}
