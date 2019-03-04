package case5;

import case5.gui.CounterDisplay;
import case5.problemdomain.CounterManager;

public class Application {

	public static void main(String[] args) {
		var manager = new CounterManager();
		var counter = manager.getCounter();
		var gui = new CounterDisplay();

		for (int i = 0; i < 10; i++) {
			counter.incrementAndShow(gui);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		manager.shutdown();
	}
}
