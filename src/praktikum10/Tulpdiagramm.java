package praktikum10;

import java.util.ArrayList;
import java.util.Scanner;

import praktikum1.TextIO;

public class Tulpdiagramm {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbrid = new ArrayList();
		while (true){
				System.out.println("sisesta üks arv (0 lõpetab)");
//		int kasutajaSisestus = TextIO.getlnInt(); --see oleks Text.IO-ga tehes
		int input = sc.nextInt();
				if (input ==0){
			break;
		}
			numbrid.add(input);
		}
		
//		System.out.println(numbrid);
		for (int i = 0; i < numbrid.size(); i++) {
			int nr =numbrid.get(i);
			System.out.printf("%2d %s\n", nr, genereeriIks(numbrid.get(i)));
		}
		}
	public static String genereeriIks(int nr) {
		String iksid = "";
		for (int i = 0; i < nr; i++) {
			iksid = iksid +"x";
		}
		return iksid;
	}
}
