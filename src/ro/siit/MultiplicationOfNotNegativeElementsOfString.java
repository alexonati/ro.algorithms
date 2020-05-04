package ro.siit;

public class MultiplicationOfNotNegativeElementsOfString {
	public static void main(String[] args) {
		// int[] arr = { -1, -2, 3, 7, -5 };
		// System.out.println(ro.siit.MultiplicationOfNotNegativeElementsOfString(int [] arr);
	}

	public static int product(int[] sir) {
		int[] sir1 = { 4, 6, 5, -14, 80 };
		int resultat = 0;
		while (sir1 != null) {
			for (int element : sir1) {
				if (element > 0)
					resultat *= element;
				return resultat;
			}
			{
				return 1;
			}
		}
		return 1;

	}
}
