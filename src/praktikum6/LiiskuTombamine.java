package praktikum6;

import lib.TextIO;

public class LiiskuTombamine {
	public static void main(String[] args) {
		System.out.println("Sisesta inimeste arv");
		int inimesteArv = TextIO.getlnInt();
		
		for (int i = 0; i < 10; i++){ //Testimiseks
				
		System.out.println("Võitja on inimene nr: " + ArvuVahemik.suvalineArv(1, inimesteArv));
		}
	}
}
