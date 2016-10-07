package praktikum8;

import praktikum6.ArvuVahemik;

public class Kuulujutud {
	public static void main(String[] args) {
		
		String[] mehed = {"Juku", "Juhan", "Taavi", "Jaanus"};
		String[] naised = {"Eve", "Anni", "Krista"};
		String[] tegevus = {"räägivad", "vaatavad aknast välja", "vihkavad teineteist"};
		
//		int suvalineMees = (int)(Math.random() *mehed.length);
//		int suvalineNaine = (int) (Math.random() *naised.length);
//		int suvalineTegevus = (int) (Math.random() *tegevus.length);
//		System.out.println(mehed [suvalineMees]+" ja "+naised[suvalineNaine]+" " +tegevus[suvalineTegevus]);

		
//		String meheNimi = suvalineElement(mehed);
//		 	System.out.println(meheNimi); 
//		String naiseNimi = suvalineElement (naised);
//			System.out.println(naiseNimi);	 
//		String tegevuseNimi = suvalineElement (tegevus);
//			System.out.println(tegevuseNimi);	
//			System.out.println(meheNimi + " ja " + naiseNimi + " "+ tegevuseNimi);
	
	System.out.format("&s ja &s &s.", suvalineElement(mehed), suvalineElement(naised), suvalineElement(tegevus));
	
	}

	public static String suvalineElement(String[] s6nad) {
		int suvalineIndex = ArvuVahemik.suvalineArv(0, s6nad.length - 1);
		return s6nad[suvalineIndex];
	}

}