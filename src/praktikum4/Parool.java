package praktikum4;

import praktikum1.TextIO;

public class Parool {
	public static void main(String[] args) {

		String oigeparool = "KavalRebane1";

		while (true) {
			System.out.println("Sisesta parool");
			String sisestatudParool = TextIO.getlnString();
			if (oigeparool.equals(sisestatudParool)) {
				System.out.println("Õige parool");
				break;
			} else {
				System.out.println("Vale parool");
			}
		}

	}
}
