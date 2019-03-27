import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException{
		BoardGame boardGame = new BoardGame();
		boardGame.addPlayer("Suzy", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		boardGame.addPlayer("Adam", GamePiece.BLUE_BOOT, Location.KITCHEN);
		boardGame.addPlayer("Jenny", GamePiece.RED_THIMBLE, Location.BALLROOM);
		boardGame.addPlayer("Leo", GamePiece.BLUE_RACER, Location.LIBRARY);
	}
}
