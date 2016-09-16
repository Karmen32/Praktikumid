package praktikum5;

import praktikum1.TextIO;

public class Tabel22ristega {

	public static void main(String[] args) {
		System.out.println("Sisesta tabeli suurus");
		int tabeliSuurus = TextIO.getlnInt();
		for (int i = 0; i < tabeliSuurus; i++) {
			for (int j = 0; j < tabeliSuurus; j++) {
				if (j == i || i +j == tabeliSuurus-1){
					System.out.print("x ");
				}else {
				System.out.print("0 ");
			}
		//	System.out.print("(i:" + i + " j:" + j + ")");
		}
			System.out.println();
		}	
	}

}
