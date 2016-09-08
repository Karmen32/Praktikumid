package praktikum2;

import lib.TextIO;

public class Arvuta {
	public static void main(String[] args) {
		
		int arv1;
		int arv2;
		int korrutis;

		System.out.println("Palun sisesta kaks arvu");
		arv1 = TextIO.getInt();
		arv2 = TextIO.getInt();

		korrutis = arv1 * arv2;

		System.out.println("Nende arvude korrutis on: " + korrutis);
	}

}
