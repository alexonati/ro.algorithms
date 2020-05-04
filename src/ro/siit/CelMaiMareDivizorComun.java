package ro.siit;

public class CelMaiMareDivizorComun {

	public static void main(String[] args) {
		int result = cmmdc(3, 89);
		System.out.println(result);

	}

	private static int cmmdc(int a, int b) {
		int min = Math.min(a, b);
		for (int i = min; i > 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;
	}
}