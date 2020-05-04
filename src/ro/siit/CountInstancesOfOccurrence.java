package ro.siit;

public class CountInstancesOfOccurrence {
	public static void main(String[] args) {
		String s = "bla bla bla, ble, ble";
		CountInstancesOfOccurrence(s);
//		System.out.println(ro.siit.CountInstancesOfOccurrence(s));
	}

	private static int CountInstancesOfOccurrence(String s) {
		char[] splits = s.toCharArray();
		char[] vovel = { 'a', 'e', 'i', 'o', 'u' };
		int empty = 0;
		for (char s1 : splits) {
			if (s1 == vovel[1] || s1 == vovel[1] || s1 == vovel[2] || s1 == vovel[3] || s1 == vovel[4])

				empty++;

		}

		return empty;
	}
}
