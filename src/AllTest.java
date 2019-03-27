
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.*;

public class AllTest {
	@Test
	public void test() {
		BoardGame boardGame = new BoardGame();
		Assert.assertEquals("error on addPlayer", true, boardGame.addPlayer("Suzy", GamePiece.MAGENTA_RACER, Location.LIBRARY));
		boardGame.addPlayer("Suzy", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		boardGame.addPlayer("Adam", GamePiece.BLUE_BOOT, Location.KITCHEN);
		boardGame.addPlayer("Jenny", GamePiece.RED_THIMBLE, Location.BALLROOM);		
		boardGame.addPlayer("Leo", GamePiece.BLUE_RACER, Location.LIBRARY);
		Set<String> allPlayers = new HashSet<String>(Arrays.asList("Adam","Suzy","Leo","Jenny"));
		Assert.assertEquals("wrong name", "Suzy", "Suzy");
		Assert.assertEquals("wrong game piece", GamePiece.MAGENTA_RACER, boardGame.playerPieces.get("Suzy"));
		Assert.assertEquals("wrong location", Location.LIBRARY, boardGame.playerLocations.get("Suzy"));
		Assert.assertEquals("error on addPlayer", false, boardGame.addPlayer("Suzy", GamePiece.MAGENTA_RACER, Location.LIBRARY));
		Assert.assertEquals("wrong player game Piece", GamePiece.MAGENTA_RACER, boardGame.getPlayerGamePiece("Suzy"));
		Assert.assertEquals("wrong player game Piece", "Suzy", boardGame.getPlayerWithGamePiece(GamePiece.MAGENTA_RACER));
		boardGame.movePlayer("Suzy", Location.BILLIARD_ROOM);
		Assert.assertEquals("incorrect movePlayer",Location.BILLIARD_ROOM, boardGame.playerLocations.get("Suzy"));
		String[] twoPlayers = {"Suzy", "Adam"};
		Location[] twoLocations = {Location.BALLROOM, Location.CONSERVATORY};
		boardGame.moveTwoPlayers(twoPlayers, twoLocations);
		Assert.assertEquals("incorrect moveTwoPlayers1",Location.BALLROOM, boardGame.playerLocations.get("Suzy"));
		Assert.assertEquals("incorrect moveTwoPlayers1",Location.CONSERVATORY, boardGame.playerLocations.get("Adam"));
		Assert.assertEquals("wrong location", Location.BALLROOM, boardGame.getPlayersLocation("Suzy"));
		ArrayList<GamePiece> PieceLocation = new ArrayList<GamePiece>();
		PieceLocation.add(boardGame.getPlayerGamePiece("Suzy"));
		PieceLocation.add(boardGame.getPlayerGamePiece("Jenny"));
		
		Assert.assertEquals("getGamePiecesAtLocation", PieceLocation, boardGame.getGamePiecesAtLocation(Location.BALLROOM));
		Assert.assertEquals("getPlayers", allPlayers, boardGame.getPlayers());
		Set<Location> Locations = new HashSet<Location>();
		Set<GamePiece> GamePieces = new HashSet<GamePiece>();
		for(Entry<String, Location> temp : boardGame.playerLocations.entrySet()) {
			Locations.add(temp.getValue());
		}
		
		Assert.assertEquals("wrong name", GamePieces, boardGame.getPlayerLocations());
		for(Entry<String, GamePiece> temp1 : boardGame.playerPieces.entrySet()) {
			GamePieces.add(temp1.getValue());
		}
		Assert.assertEquals("wrong name", GamePieces, boardGame.getPlayerPieces());
		
	}
}
