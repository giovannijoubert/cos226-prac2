class ThreadCounterDemo {
	
	public static void main (String args[]) {
		
		Counter C = new Counter(1);
		TThread t1 = new TThread(C);
		t1.start();
		
		TThread t2 = new TThread(C);
		t2.start();
		
		TThread t3 = new TThread(C);
		t3.start();
		
		TThread t4 = new TThread(C);
		t4.start();
		
	}
}