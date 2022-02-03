package game.jam.graphics.library.core.create;

public class GameLoop {
	
	public Thread thread;
	public boolean running;
	
	public GameLoop(boolean running) {
		
	}
	
	public synchronized void start() {
		thread = new Thread();
		thread.start();
		running = true;
	}
}
