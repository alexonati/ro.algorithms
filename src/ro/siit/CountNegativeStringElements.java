package ro.siit;

public class CountNegativeStringElements {
	public static void main(String[] args) {
		int[] arr = { -1, -2, 3, 7, -5 };
		System.out.println(countNegativeElements(arr));
	}

	private static int countNegativeElements(int[] arr) {

		int count = 0;
		for (int element : arr) {
			if (element < 0) {
				count++;

			}
		}
		return count;
	}
}
