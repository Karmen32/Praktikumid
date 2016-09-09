package praktikum4;

import lib.TextIO;

public class CumLaude {
	public static void main(String[] args) {
		System.out.println("Mis on sinu kaalutud keskmine?");

		double keskhinne;
		int lpuhinne;
		keskhinne = (double) TextIO.getlnDouble();
		if (keskhinne > 5 || keskhinne < 0) {
			System.out.println("Vigane hindesisestus");
			return;
		}
		System.out.println("Mis on sinu lõputöö hinne?");
		lpuhinne = (int) TextIO.getlnInt();
		if (lpuhinne > 5 || lpuhinne < 0) {
			System.out.println("Vigane hindesisestus");
			return;
		}
		
		if (keskhinne > 4.5 && keskhinne <= 5 && lpuhinne == 5) {
			System.out.println("Jah, saad cum laude diplomile!");
		} else if (keskhinne < 4.5 || lpuhinne < 5 && lpuhinne >0) {
			System.out.println("Ei saa!");
		} else {
			System.out.println("Vigane hindesisestus");
		}
	}
}
