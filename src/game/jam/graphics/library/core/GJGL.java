package game.jam.graphics.library.core;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GJGL {
	
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
	}
	
	public void loop() {
		
	}
}
