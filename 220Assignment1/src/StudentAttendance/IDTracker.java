package StudentAttendance;

import java.util.*;

public class IDTracker {
	private Map<Integer, String> SID;//key is student# but wont let me have it as an int
	private Set<String> Attended;
	private Set<String> Absent;
	
	
	public IDTracker() {
		SID= new HashMap<>();//initialize
		SID.put(123, "joe");
		SID.put(456, "timmy");
		SID.put(789, "jimbob");
		Absent= new HashSet<String>();
		Attended= new HashSet<String>();
	}
	
	public void addIn(int k) {//adds a student who swiped in
		if(SID.containsKey(k)==true) {
			Attended.add(SID.get(k));
		}
	}
	
	public void whoCame() {
		System.out.println("Students present: " +Attended);
	}
	public void whoMissed() {// to be run at end of day
		if(Attended.containsAll(SID.values())==true) {
			System.out.println("No students Absent");
		}else {
			Absent.addAll(SID.values());
			Absent.removeAll(Attended);
			System.out.println("Students absent: "+Absent);
		}
	}
	
}
