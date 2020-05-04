package ro.siit;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static class reversingArray {

		static void reverse(Integer array []) {
			Collections.reverse(Arrays.asList(array));
			System.out.println(Arrays.asList(array));
		}

		public static void main(String[] args) {
			Integer[] arr = { 10, 20, 30, 40, 50 };
			reverse(arr);
		}
	}
}
