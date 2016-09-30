package praktikum7;

import lib.TextIO;
import praktikum6.ArvuVahemik;

public class AraarvamisMang {
	public static void main(String[] args) {
		int arvutiNumber = ArvuVahemik.suvalineArv(1, 100);
		while (true) {
			System.out.println("Millisest arvust ma mõtlen?");
			int kasutajaNumber = TextIO.getlnInt();
			if (kasutajaNumber == arvutiNumber) {
				System.out.println("Õigesti arvasid");
				break;
			} else if (kasutajaNumber < arvutiNumber) {
				System.out.println("Minu arv on suurem");
			} else {
				System.out.println("Minu arv on väiksem");
			}
		}
	}
}
