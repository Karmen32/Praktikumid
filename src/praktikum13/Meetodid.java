package praktikum13;

public class Meetodid {
	public static void main(String[] args) {
		int[] arvud = { 3, 4, 7, 2, -6 };
		
		int [][] neo = {
				{1, 1, 1, 1, 1},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7},
				{4, 5, 6, 7, 8},
				{5, 6, 7, 8, 9},
		};

//		tryki(arvud);
//		tryki(neo);
//		tryki(ridadeSummad(neo));
//		System.out.println(peaDiagonaaliSumma(neo));
//		System.out.println(korvalDiagonaaliSumma(neo));
		tryki(ridadeMaksimumid(neo));
	}

	public static void tryki(int[] massiiv) {
		// for (int i = 0; i < massiiv.length; i++) {
		// System.out.print(massiiv[i] + " ");
		// }
		for (int arv : massiiv) {
			System.out.print(arv + " ");
		}
		System.out.println();
	}

	public static void tryki(int[][] maatriks) {
//		for (int i = 0; i < maatriks.length; i++){
//			for (int j = 0; j < maatriks[i].length; j++) {
//				System.out.print(maatriks[i][j] + " ");
//			}
//		System.out.println();
//		}
		for (int[]rida:maatriks){
			tryki(rida);
		}
	}

	public static int[] ridadeSummad(int[][] maatriks) {
		int summad[] = new int[maatriks.length];
		for (int i = 0; i < maatriks.length; i++) {
			summad[i] = reaSumma(maatriks[i]);
		}

		return summad;
	}

	public static int reaSumma(int[] massiiv) {
		int summa = 0;
		for (int i = 0; i < massiiv.length; i++) {
			summa = summa + massiiv[i];
		}
		return summa;
	}

	public static int korvalDiagonaaliSumma(int[][] maatriks) {
		int summa = 0;
		for (int i = 0; i < maatriks.length; i++) {
			for (int j = 0; j < maatriks.length; j++) {
				if (i + j == maatriks.length - 1) {
					summa = summa + maatriks[i][j];
				}
			}
		}
		return summa;

	}

	public static int peaDiagonaaliSumma(int[][] maatriks) {
		int summa =0;
		for (int i = 0; i < maatriks.length; i++) {
			for (int j = 0; j < maatriks.length; j++) {
				if (i==j){
					summa = summa+maatriks[i][j];
				}
				System.out.print(maatriks[i][j]+ "(i="+i+")"+"(j="+j+")");
			}
			System.out.println();
		}
		return summa;
	}
	
	public static int peaDiagonaaliSummaEfektiivsemalt(int[][] maatriks){
		int summa =0;
		for (int i = 0; i < maatriks.length; i++) {
			summa = summa+maatriks[i][i];
		}
		return summa;
		
	}
	
	
	public static int[] ridadeMaksimumid(int[][] maatriks){
		int maksimumid[] = new int[maatriks.length];
		for (int i = 0; i < maksimumid.length; i++) {
			maksimumid[i]=reaSuurim(maatriks[i]);
		}
		return maksimumid;
	}
	public static int reaSuurim(int[] massiiv){
		int suurim =Integer.MIN_VALUE;
		for (int i = 0; i < massiiv.length; i++) {
			if (massiiv[i]>suurim){
				suurim = massiiv[i];
			}
		}
		return suurim;
	}
	
	public static int miinimum(int[][] maatriks){
//		for (int i = 0; i < maatriks.length; i++) {
//			if(maatriks[i]<)
//		}
		return 0;
		
	}
	public static int reaMiinimum(int[] massiiv){
		int miinimum =Integer.MAX_VALUE;
		for (int i = 0; i < massiiv.length; i++) {
			if (massiiv[i]< miinimum){
				miinimum=massiiv[i];
			}
		}
		return miinimum;
		
	}
}
