package praktikum10;

import java.util.ArrayList;

public class YheMassiiviSuurimElement {
	public static void main(String[] args) {
		int[] massiiv = {1, 3, 6, 7, 8, 3, 5, 7, 21, 3};
		int suurim = suurim(massiiv);
		System.out.println(suurim);
}

	private static int suurim(int[] massiiv) {
		int suurim = Integer.MIN_VALUE;
		for (int i=0; i <massiiv.length; i++) {
			if (suurim < massiiv[i]) {
				suurim = massiiv[i];
			}
		}
		return suurim;
	}
}
