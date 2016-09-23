package praktikum6;

import praktikum1.TextIO;

public class Meetodid {
	public static void main(String[] args) {
		System.out.println("Sisesta arv");

		int arv = TextIO.getlnInt();
		int arvKuubis = kuup(arv);
		System.out.println("Arv kuubis on " + arvKuubis);
	}
	
	public static int kuup(int i) {
		return (int) Math.pow(i, 3);
	}
	
}
