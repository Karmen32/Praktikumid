package praktikum4;

import praktikum1.TextIO;

public class Tehisintellekt {
	public static void main(String[] args) {
		System.out.println("Palun sisesta kaks vanust");
		int vanus1 = TextIO.getlnInt();
		if (vanus1 < 0) {
			System.out.println("Vanus ei saa olla negatiivne");
		}
		int vanus2 = TextIO.getlnInt();
		if (vanus2 < 0) {
			System.out.println("Vanus ei saa olla negatiivne");
		}
		int vanustevahe = Math.abs(vanus1 - vanus2);

		if (vanustevahe > 10) {
			System.out.println("Midagi veel krõbedamatt");
		} else if (vanustevahe > 5) {
			System.out.println("No ei sobi");
		} else {
			System.out.println("Sobib");
		}

	}
}
