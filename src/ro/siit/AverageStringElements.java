package ro.siit;

public class AverageStringElements {
	public static void main(String[] args) {
		int[] arr = { 9, 9, 8 };
		double average = avg(arr);
		System.out.println(average);

	}

	private static double avg(int[] arr) {
		double suma = 0;
		for (int element : arr) {
			suma += element;
		}
		{
			return suma / arr.length;
		}
	}
}
