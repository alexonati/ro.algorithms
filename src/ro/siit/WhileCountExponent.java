package ro.siit;

public class WhileCountExponent {
	public static void main(String[] args) {

		int a = 6000;
		int suma = 0;

		while (a > 1) {
			suma += 1;
			a = a / 2;
		}
		;
		System.out.println(suma);
	}
}
