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
	
	public Integer getPlayerCountViaRole(Rcb team, String role) {
		List<Player> playerList = new ArrayList<Player>();
		playerList = team.getPlayer();
		int count = 0;
		for (Player player : playerList) {
			if ((player.getRole()).equalsIgnoreCase(role))
				count++;
		}
		return count;

	}
	
	public Integer getForeignPlayers(Rcb team) {
		return team.getPlayer().size()-getPlayerCountViaCountry(team, "India");
		
	}
	
	public Boolean checkWicketKeeperRole(Rcb team) {
		boolean wicketKeeper = false;
		if (getPlayerCountViaRole(team, "Wicket-keeper") >= 1)
		{
		wicketKeeper =true;	
		}
		return wicketKeeper;
		
	}

}
