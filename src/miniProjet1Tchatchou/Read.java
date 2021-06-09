package miniProjet1Tchatchou;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Read {

	public String pickWord() {

		int n = (int) (Math.random() * 336531) + 1;

		File f = new File("DicoSansAccent.txt");
		int counter = 1;
		String line, mot = "";
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(f));
			while ((line = br.readLine()) != null) {
				counter++;
				if (counter == n) {
					mot += line;
				}
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mot;
	}

}
