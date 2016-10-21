package praktikum10;

import java.util.ArrayList;

public class KaheMassiiviSuurimElement {

	public static void main(String[] args) {
		int[][] neo = {
			    {1, 3, 6, 7},
			    {2, 3, 3, 1},
			    {17, 4, 5, 0},
			    {-20, 13, 16, 17}
			};
		ArrayList<Integer> suurimad = new ArrayList();
		for (int i = 0; i < neo.length; i++) {
			suurimad.add(getSuurim(neo[i]));
		}
		int[] suurimadMassiiv = new int[suurimad.size()];
		for (int i = 0; i < suurimad.size(); i++) {
			suurimadMassiiv[i] = suurimad.get(i);
		}
		int suurim = getSuurim(suurimadMassiiv);
		System.out.println(suurim);

		}
		

	private static int getSuurim(int[] massiiv) {
		int suurim = Integer.MIN_VALUE;
		for (int i = 0; i < massiiv.length; i++) {
			if (suurim < massiiv[i]) {
				suurim = massiiv[i];
			}
		}
		return suurim;

	}
}
