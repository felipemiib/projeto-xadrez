package boardgame;

public class Piece {

	protected Position position; // S� � acessado por classes do mesmo pacote
	private Board board;
	public Piece(Board board) {
		
		this.board = board;
		position = null;
	}
	protected Board getBoard() { // S� � acessado por classes do mesmo pacote
		return board;
	}

	public String toString() {
		return "A borda �: " + board;
	}

}
