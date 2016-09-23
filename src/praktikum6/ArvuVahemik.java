package praktikum6;

import lib.TextIO;

public class ArvuVahemik {
	public static void main(String[] args) {
	
		int hinne = kasutajaSisestus(1,5);
		System.out.println("Sisestatud hinne: "+ hinne);
	}
	public static int kasutajaSisestus (int min, int max){
		while (true) {
			System.out.println("Sisesta arv vahemikus " + min + " kuni " + max);
			int sisestus = TextIO.getlnInt();
			if (sisestus >= min && sisestus <= max) {
				return sisestus;
			} else {
				System.out.println("Ei sobi see arv");
			}
		}
	}
	
}
