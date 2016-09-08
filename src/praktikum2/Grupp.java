package praktikum2;

import lib.TextIO;

public class Grupp {
	public static void main(String[] args) {


		System.out.println("Palun sisesta inimeste arv?");
		int inimesteArv = TextIO.getlnInt();
		
		System.out.println("Palun sisesta grupi suurus");
		int grupisuurus = TextIO.getlnInt();
		
		int gruppidearv = inimesteArv / grupisuurus;
		
		System.out.println("Inimestest saab moodustada "+gruppidearv+" gruppi");
		
		int j22k = inimesteArv % grupisuurus;
		System.out.println("Üle jääb " +j22k+ " inimest");
	}
}
