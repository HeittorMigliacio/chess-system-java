package boardgame;

public class Piece {
	
	protected Position position;
	
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// Only class in the same package
	protected Board getBoard() {
		return board;
	}
	
	

}
