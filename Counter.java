class Counter {
	
	int value;
	
	Counter(int c) {
		value = c;
	}
	
	int getAndIncrement() {
		return value++;
	}
	
}