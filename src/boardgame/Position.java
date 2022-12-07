package boardgame;

public class Position {
	
	private Integer row;
	private Integer column;
	
	// Construtores da classe
	
	public Position () {
	}
	
	public Position(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}
	
	// Métodos getters and setters

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	// Métodos da classe
	
	@Override
	public String toString () {
		return row + ", " + column;
	}

}
