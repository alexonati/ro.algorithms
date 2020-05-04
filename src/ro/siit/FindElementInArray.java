package ro.siit;

public class FindElementInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 1, 10, 7 };
		int b = 2;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(i);
			if (b == arr[i]) {
				System.out.println(i);
				flag = true;
				break;
			}

		}

		if (!flag) {
			System.out.println("Not found!");
		}
	}
}
