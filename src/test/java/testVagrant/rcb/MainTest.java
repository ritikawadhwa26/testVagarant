package testVagrant.rcb;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import testVagrant.rcb.methods.PlayerHelper;

public class MainTest extends BaseTest {
	/**
	 * Rigorous Test :-)
	 */

	@Test
	public void teamHasOnlyFourForeignPlayers() {
		Assert.assertEquals(new PlayerHelper().getForeignPlayers(rcbTeam), 4,
				"Team does not has only 4 foreign players");
	}

	@Test
	public void teamHasAtleastOneWicketKeeper() {
		Assert.assertTrue(new PlayerHelper().checkWicketKeeperRole(rcbTeam),
				"Team does not has atleast 1 wicket keeper");
	}

}
