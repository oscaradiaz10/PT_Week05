package OOP_Menu_App;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private List<Player> players = new ArrayList<Player>();
	private String name;
	
	public Team(String name) {
		this.setName(name);
	}
	
	public void describe() {
		System.out.println("Team name: " + name);
		for (Player player : players) {
			player.describe();
		}
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void removePlayer(String playerName) {
		for (Player player : players) {
			if (player.getName().equals(playerName)) {
				players.remove(player);
			}
		}
	}
	
	// Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
