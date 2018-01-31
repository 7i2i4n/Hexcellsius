package model;

public class Hex extends Tile {

	public Hex(int x, int y, HexType type) {
		super(x, y);
		this.type = type;

	}

	private HexType type;

	public HexType getType() {
		return type;
	}

	public void setType(HexType type) {
		this.type = type;
	}

}
