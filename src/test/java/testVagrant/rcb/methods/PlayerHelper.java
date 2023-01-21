package testVagrant.rcb.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import testVagrant.rcb.pojo.Player;
import testVagrant.rcb.pojo.Rcb;

public class PlayerHelper {

	public Integer getPlayerCountViaCountry(Rcb team, String country) {
		List<Player> playerList = new ArrayList<Player>();
		playerList = team.getPlayer();
		int count = 0;
		for (Player player : playerList) {
			if ((player.getCountry()).equalsIgnoreCase(country))
				count++;
		}
		return count;

	}
	
	public Integer getForeignPlayers(Rcb team) {
		return team.getPlayer().size()-getPlayerCountViaCountry(team, "India");
		
	}

}
