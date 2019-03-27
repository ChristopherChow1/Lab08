import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces = new LinkedHashMap<>();
	protected LinkedHashMap<String, Location> playerLocations = new LinkedHashMap<>();
	//private GamePiece gamePiece;
	public BoardGame() {
		
		
	}
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {

		if (playerPieces.containsValue(gamePiece)) {
			return false;
		}else {
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
			return true;
		}
	}
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);
	}
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		String name = "";
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
			if (entry.getValue().equals(gamePiece)){
				name = entry.getKey();
			};
		}
		return name;
	}
	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.replace(playerName, newLocation);
	}
	public java.lang.String[] moveTwoPlayers(String[] playerNames, Location[] newLocations){
		GamePiece a = getPlayerGamePiece(playerNames[0]);
		GamePiece b = getPlayerGamePiece(playerNames[1]);
		String[] R = new String[2];
		if (a.equals(GamePiece.movesFirst(a,b))) {
			movePlayer(playerNames[0], newLocations[0]);
			movePlayer(playerNames[1], newLocations[1]);
			R[0] = playerNames[0];
			R[1] = playerNames[1];
		} else {
			movePlayer(playerNames[1], newLocations[1]);
			movePlayer(playerNames[0], newLocations[0]);
			R[1] = playerNames[1];
			R[0] = playerNames[0];
		}
		return R;
	}
	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);
	}
	public java.util.ArrayList<java.lang.String> getPlayersAtLocation(Location loc){
		ArrayList<String> Players = new ArrayList<String>();
		for(Entry<String, Location> temp : playerLocations.entrySet()) {
			if (temp.getValue().equals(loc)) {
				Players.add(temp.getValue().toString());
			}
		}
		return Players;
	}
	public java.util.ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
		ArrayList<String> Players = new ArrayList<String>();
		ArrayList<GamePiece> GP = new ArrayList<GamePiece>();
		for(Entry<String, Location> temp : playerLocations.entrySet()) {
			if (temp.getValue().equals(loc)) {
				Players.add(temp.getValue().toString());
				for(Entry<String, GamePiece> temp1 : playerPieces.entrySet()) {
					if(temp1.getKey().equals(temp.getKey())) {
						GP.add(temp1.getValue());}
				}
			}
		}
		return GP;
	}
	public java.util.Set<java.lang.String> getPlayers(){
		Set<String> allPlayers = new HashSet<String>();
		for(Entry<String, Location> temp : playerLocations.entrySet()) {
			allPlayers.add(temp.getKey());
		}
		return allPlayers;
	}
	public java.util.Set<Location> getPlayerLocations(){
		Set<Location> allLocations = new HashSet<Location>();
		for(Entry<String, Location> temp : playerLocations.entrySet()) {
			allLocations.add(temp.getValue());
		}
		return allLocations;
	}
	public java.util.Set<GamePiece> getPlayerPieces(){
		Set<GamePiece> allGamePieces = new HashSet<GamePiece>();
		for(Entry<String, GamePiece> temp : playerPieces.entrySet()) {
			allGamePieces.add(temp.getValue());
		}
		return allGamePieces;
	}

}
