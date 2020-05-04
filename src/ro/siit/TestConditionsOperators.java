package ro.siit;

public class TestConditionsOperators {
	public static void main(String[] args) {
		int nota = 10;
		System.out.println(nota >= 5 ? (nota >= 7 ? (nota >= 8 ? "Excelent" : "acceptabil") : "slab") : "respins");
	}
}