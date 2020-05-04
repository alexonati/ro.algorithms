package ro.siit;

import java.util.Arrays;

public class IsUnique {

	public static void main(String args[]) {
		IsUnique obj = new IsUnique();
		String input = "Ana are mere";

		if (obj.IsUnique(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}

	boolean IsUnique(String str) {
		char[] chArray = str.toCharArray();

		Arrays.sort(chArray);

		for (int i = 0; i < chArray.length - 1; i++) {

			if (chArray[i] != chArray[i + 1])
				continue;

			else
				return false;
		}
		return true;
	}

}
