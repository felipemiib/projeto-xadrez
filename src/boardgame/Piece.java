package boardgame;

public class Piece {

	protected Position position; // Só é acessado por classes do mesmo pacote
	private Board board;
	public Piece(Board board) {
		
		this.board = board;
		position = null;
	}
	protected Board getBoard() { // Só é acessado por classes do mesmo pacote
		return board;
	}

	public String toString() {
		return "A borda é: " + board;
	}

}
