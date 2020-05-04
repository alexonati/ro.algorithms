package ro.siit;

public class EmailValidator {
	public static void main(String[] args) {
		isEmailValid("qwe@qwe.ro");
		System.out.println(isEmailValid("qwe@qwe.ro"));

	}

	private static boolean isEmailValid(String string) {
		if (string.contains("@") && string.contains(".") && string.contains("ro")
				&& string.indexOf("@") < string.indexOf(".")) {
//			int index1 = s.indexOf("@");
//			int index2 = s.indexOf(".");
//			if (index1 != -1 && index2 != -1){
			return true;
		}
		return false;

	}

}
