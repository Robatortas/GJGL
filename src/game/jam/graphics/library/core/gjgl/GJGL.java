package game.jam.graphics.library.core.gjgl;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class GJGL extends Canvas{
	
	private static final long serialVersionUID = 1L;

	public String gjglState() {
		return "Installed on your machine";
	}
	
	// Threading
	
	public Thread thread;
	public boolean running;
	
	public synchronized void start() {
		thread = new Thread();
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		running = false;
	}

	public void loop() {
		float lastTime = System.nanoTime();
		float timer = System.nanoTime();
		double ns = 1000000000.0/60.0;
		double delta = 0;
		int frames = 0;
		int updates = 0;
		
		while(running) {
			float now = System.nanoTime();
			float passedTime = now-lastTime;
			delta += passedTime/ns;
			lastTime = now;
			
			while(delta >= 1) {
				updates++;
				delta--;
			}
		}
	}
	
	// Threading end
	
	// Render
	
	public BufferStrategy createBufferStrategy() {
		BufferStrategy bs = getBufferStrategy();
		return bs;
	}
	
	public void startBufferStrategy(BufferStrategy bs) {
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
	}
	
	public Graphics getGraphics(BufferStrategy bs) {
		Graphics g = bs.getDrawGraphics();
		return g;
	}
	
	// Render end
	
	// Screen
	
	public void drawPixel() {
		
	}
	
	// Screen end
}
