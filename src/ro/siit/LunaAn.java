package ro.siit;

import java.util.Scanner;

public class LunaAn {
	public static void main(String[] args) {
		System.out.println("Despre care luna doriti informatii? ");
		System.out.print("Introduceti luna: ");
		Scanner scanner = new Scanner(System.in);
		String luna = scanner.nextLine();
		int result = Integer.parseInt(luna);
		switch (result) {
		case 2:
			System.out.println("Luna are 28 de zile si este luna Februarie iar anul nu este bisect.");
		case 1:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Luna are 30 sau 31 de zile si nu este Februarie.");
			System.out.println("Iar anul?");
			System.out.print("Introduceti anul: ");
			Scanner scanner1 = new Scanner(System.in);
			String an = scanner1.nextLine();
			int result1 = Integer.parseInt(an);
			boolean flag = false;
			if (result1 % 4 == 0) {
				flag = true;
			} else {
				flag = false;
			}
			if (flag) {
				System.out.println("Iar anul este unul bisect.");
			} else {
				System.out.println("Iar anul nu este bisect.");
				scanner.close();
			}
		}
	}
}