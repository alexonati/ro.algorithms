package ro.siit;

public class AddThingsFromAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 6, 12, 3, 5, 7 };

		int leftEnd = 2;
		int rightEnd = 7;
		int suma = 0;

		// for (int i = 0; i < arr.length; i++)
		for (int element : arr) {
			if (element >= leftEnd && element <= rightEnd)
				suma += element;

		}
		System.out.println(suma);
	}
}
