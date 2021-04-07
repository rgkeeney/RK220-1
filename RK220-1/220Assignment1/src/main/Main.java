package main;

import StudentAttendance.IDTracker;

public class Main {
	public static void main(String[] args) {
		IDTracker test= new IDTracker();
		test.addIn(123);
		test.addIn(456);
		test.addIn(789);
		test.whoCame();
		test.whoMissed();
	}
}
