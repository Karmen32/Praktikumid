package praktikum14;

import java.util.ArrayList;

public class T2hestikulineJarjestus {
	
	public static void main(String[] args) {

		  ArrayList<String> failiSisu = FailiLugeja.loeFail("kala.txt");
		  java.util.Collections.sort(failiSisu);
		 
		  System.out.println(failiSisu);
	}
}
