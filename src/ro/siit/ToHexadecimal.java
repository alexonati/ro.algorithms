package ro.siit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ToHexadecimal {
	public static void main(String[] args) {
		int a = 1908;
		String b = Integer.toBinaryString(a);
		System.out.println(b);

		int c = 9231;
		String d = Integer.toHexString(c);
		System.out.println(d);

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));

		int[] arr2 = new int[10];
		System.arraycopy(arr, 3, arr2, 5, 2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Array.getLength(arr2));

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(matrix[0]));

		boolean f = false;
		System.out.println(!f);
		System.out.println(!!f);

		int[] arr5 = { 1, 2, 3, 4, 5, 14, 12 };
		System.out.println(Arrays.toString(arr5));
	}
}
