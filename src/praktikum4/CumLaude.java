package praktikum4;

import lib.TextIO;

public class CumLaude {
	public static void main(String[] args) {
		System.out.println("Mis on sinu kaalutud keskhinne?");

		int keskhinne;
		int lpuhinne;
		
		keskhinne = (int) TextIO.getlnDouble();
		System.out.println("Mis on sinu lõputöö hinne?");

		lpuhinne = (int) TextIO.getlnDouble();
		
if (keskhinne > 4.5 && lpuhinne == 5){
		System.out.println("Jah, saad cum laude diplomile!");
}	
}
}
