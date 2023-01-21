package testVagrant.rcb;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

import testVagrant.rcb.pojo.Rcb;

/**
 * A simple unit test
 */
public class MainTest {
	/**
	 * Rigorous Test :-)
	 */
	Rcb rcbTeam;

	@BeforeMethod
	public void getRcbTeam() {
		Main m = new Main();
		rcbTeam = m.getTeam();
	}

	@Test
	public void shouldAnswerWithTrue() {
		System.out.println(rcbTeam.getName());
	}
	
	@Test
	public void teamHasOnlyFourForeignPlayers()
	{
		
		
	}
	
}
