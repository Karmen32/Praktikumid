package praktikum4;

import praktikum1.TextIO;

public class Parool {
	public static void main(String[] args) {
		System.out.println("Sisesta parool");
		String oigeparool = "KavalRebane";

		while (true) {
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
