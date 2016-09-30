package praktikum7;

import lib.TextIO;
import praktikum6.ArvuVahemik;

public class PanustegaKullKiri {
	public static void main(String[] args) {
		int panustajaRaha = 100;

		while (panustajaRaha > 0) {
			System.out.println("Kui suure panuse peale panustad? Sul on " + panustajaRaha + " raha");
			int maxPanus = Math.min(25, panustajaRaha);
			int panus = ArvuVahemik.kasutajaSisestus("Sisesta panus (max " + maxPanus + ")", 1, maxPanus);
			int myndivise = ArvuVahemik.suvalineArv(0, 1);
			System.out.println(myndivise);
			if (myndivise == 1) {
				panustajaRaha += panus * 2;
				System.out.println("Arvasid ära, tuli kiri.");
			} else {
				panustajaRaha -= panus;
				System.out.println("Mööda panid, tuli kull.");
			}
		}
		System.out.println("Raha otsas, mäng läbi");
	}
}
