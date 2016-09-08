package praktikum2;

import lib.TextIO;

public class Nimet2hed {
	public static void main(String[] args) {
		String nimi;
		System.out.println("Mis su nimi on?");
		nimi = TextIO.getlnString();

		int nimePikkus = nimi.length();

		System.out.println("Sinu nimes on " + nimePikkus + " tähte.");

	}
}
