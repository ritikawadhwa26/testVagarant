package testVagrant.rcb;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import testVagrant.rcb.pojo.Rcb;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
	}

	public Rcb getTeam() {

		ObjectMapper mapper = new ObjectMapper();

		// JSON from file to Object
		Rcb team = null;
		try {
			team = mapper.readValue(
					new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
							+ File.separator + "java" + File.separator + "resources" + File.separator + "TeamRCB.json"),
					Rcb.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return team;
	}

}
