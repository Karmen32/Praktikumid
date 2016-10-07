package praktikum8;

import lib.TextIO;

public class Arvud {
	public static void main(String[] args) {
		System.out.println("Anda 10 suvalist arvu.");
		int[] arvud = new int[10];

		for (int i = 0; i < arvud.length; i++) {
			System.out.println("Palun sisesta arv " + i);
			arvud[i] = TextIO.getlnInt();
		}
		for (int i = arvud.length - 1; i >= 0; i--) {
			System.out.println(arvud[i]);
		}
	}
}
