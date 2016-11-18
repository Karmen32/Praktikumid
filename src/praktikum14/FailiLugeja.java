package praktikum14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FailiLugeja {

	public static ArrayList<String> loeFail(String failinimi) {
		ArrayList<String> LoetudFail = new ArrayList<String>();

		// punkt tähistab jooksvat kataloogi
		String kataloogitee = FailiLugeja.class.getResource(".").getPath();

		// otsime samast kataloogist kala.txt-nimelist faili
		File file = new File(kataloogitee + failinimi);

		try {
			// avame faili lugemise jaoks
			BufferedReader in = new BufferedReader(new FileReader(file));
			String rida;

			// loeme failist rida haaval
			while ((rida = in.readLine()) != null) {
				LoetudFail.add(rida);

			}
		} catch (FileNotFoundException e) {
			System.out.println("Faili ei leitud: \n" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error, jee, mingi muu error: " + e.getMessage());
		}

		return LoetudFail;
	}
}