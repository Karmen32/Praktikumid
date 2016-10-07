package praktikum8;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

public class Nimed {
	public static void main(String[] args) {
		ArrayList<String> nimed = new ArrayList<String>();
		while (true) {
			System.out.println("Palun sisesta nimi");
			String sisestus = TextIO.getlnString();
			if (sisestus.equals(" ")) {
				break;
			} else {
				nimed.add(sisestus);
			}

		}

		Collections.sort(nimed);
		for (String nimi : nimed) {
			System.out.println(nimi);
		}
	}
}
