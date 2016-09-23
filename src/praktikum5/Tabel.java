package praktikum5;

public class Tabel {
	public static void main(String[] args) {
		int tabeliSuurus = 9;
		for (int i = 0; i < tabeliSuurus; i++) {
			for (int j = 0; j < tabeliSuurus; j++) 
				if (j == i){
					System.out.print("1 ");
				}else {
				System.out.print("0 ");
			}
			System.out.println();

		}

	}
}
