package model;

public abstract class Tile {
/**
 * Abstract Version of a Hexcell
 */
	private int row;
	private int colum;
	private Tile[] ring = new Tile[6];

	public Tile(int x, int y) {
		this.row = x;
		this.colum = y;
	}

	public Tile[] getRing() {
		return ring;
	}

	public int getRow() {
		return row;
	}

	public int getColum() {
		return colum;
	}

}
