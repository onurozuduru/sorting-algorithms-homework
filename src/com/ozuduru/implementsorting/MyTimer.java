package com.ozuduru.implementsorting;

// It is a simple class that keeps start time and total time.
public class MyTimer {
	private long startTime, totalTime;

	public MyTimer() {
		startTime = 0;
		totalTime = 0;
	}

	public void reset() {
		startTime = 0;
		totalTime = 0;
	}

	// Set start time.
	public void start() {
		startTime = System.nanoTime();
	}
	
	// Add time difference to totaltime
	public void stop() {
		long endTime = System.nanoTime();
		totalTime += (endTime - startTime);
	}
	
	// We keep time as nanoseconds but while we get the total time that function converts miliseconds.
	public double getTotalTimeInMilis() {
		return totalTime / 1000000.0;
	}
}
