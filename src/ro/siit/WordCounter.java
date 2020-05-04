package ro.siit;

public class WordCounter {
	public static void main(String[] args) {
		String s = "bla bla bla bla, bla";
		System.out.println(countWords(s));
	}

	private static int countWords(String s) {
		String[] splits = s.split("[, .]");
		int c = splits.length;
		int empty = 0;
		for (String s1 : splits) {
			if (s1.isEmpty()) {
				empty++;

			}
		}

		return c - empty;
	}
}
