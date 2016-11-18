package praktikum14;

import java.util.ArrayList;

public class NumbriteKeskmine {

	public static void main(String[] args) {
		
		ArrayList<String> Sisu = FailiLugeja.loeFail("numbrid.txt");
		ArrayList<Double> numbrid = teeNumbriteks(Sisu);
		System.out.println(numbrid);
		double keskmine = arvutaKeskmine(numbrid);
		System.out.println("nende arvude keskmine on: " + keskmine);
	}
	
	private static double arvutaKeskmine(ArrayList<Double> numbrid) {
		double summa = 0;
		for (Double nr : numbrid) {
			summa+= nr;
		}
		return summa/numbrid.size();
	}

	public static ArrayList<Double> teeNumbriteks(ArrayList<String> read) {
		ArrayList<Double> numbrid= new ArrayList<Double>();
		for(String rida:read){
			
			try {
				double nr = Double.parseDouble(rida);
				numbrid.add(nr);
			} catch (NumberFormatException e) {
				System.out.println("Ei oska seda numbriks teha: "+ rida);
			}
		}
		
		return numbrid;
	}


}
