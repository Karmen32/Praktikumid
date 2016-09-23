package praktikum6;

import lib.TextIO;

public class ArvuVahemik {
	
	public static int kasutajaSisestus(String kysimus, int min, int max) {
		while (true){
		System.out.println(kysimus);
		int sisestus = TextIO.getlnInt();
		if (sisestus >= min && sisestus <= max) {
			return sisestus;
	}
		}
	}
	
	public static int kasutajaSisestus (int min, int max){
		while (true) {
//			System.out.println("Sisesta arv vahemikus " + min + " kuni " + max);
			int sisestus = TextIO.getlnInt();
			if (sisestus >= min && sisestus <= max) {
				return sisestus;
			} else {
				System.out.println("Ei sobi see arv");
			}
		}
	}
	
	public static int suvalineArv (int min, int max) {
		int vahemik = max - min + 1;
		return min + (int) (Math.random() * vahemik);
	}

	public static void main(String[] args) {
		for (int i=0; i<10; i++){
			System.out.println(suvalineArv(-5, 5));
		}
	}
}
