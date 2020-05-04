package ro.siit;

import java.util.Arrays;

public class IntToArray {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };

		String strArray[] = new String[intArray.length];

		for (int i = 0; i < intArray.length; i++)
			strArray[i] = String.valueOf(intArray[i]);

		System.out.println(Arrays.toString(strArray));
	}
}
