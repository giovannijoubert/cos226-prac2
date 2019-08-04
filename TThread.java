class TThread extends Thread {
	
	Counter count;
	
	TThread(Counter c) {
		count = c;
	}
	
	public void run() {
		for (int i = 1; i < 4; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			
		}
	}
}