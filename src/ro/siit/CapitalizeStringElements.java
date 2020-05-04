package ro.siit;

public class CapitalizeStringElements {

	public static void main(String[] args) {
		String result = capitalize("popescu ion");
		System.out.println(result);
	}

	private static String capitalize(String s) {
//		s.toUpperCase();
//		s = s.toUpperCase();
		String[] arr = s.split(" ");
		String result = "";
		for (String element : arr) {
//			System.out.println(element.substring(0, 1));
			element.substring(0, 1);
//			System.out.println(element.substring(1));
			result += element.substring(0, 1).toUpperCase();
			result += element.substring(1);
			result = result + " ";
		}
		return result;

	}
}