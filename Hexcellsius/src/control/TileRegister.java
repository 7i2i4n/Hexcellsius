package control;

import java.util.ArrayList;
import java.util.List;

import model.Tile;

public class TileRegister {
	/**
	 * When a Tile is created, it is registerd in the TileRegister. It serves as a complete Overview of all Tiles.
	 */

	private List<Tile> tileList;
	
	/**
	 * Returns all Tiles in the List
	 * @return tileList
	 */
	public List<Tile> getAll()
	{
		return tileList;
	}

	public TileRegister() {
		this.tileList = new ArrayList<Tile>();
	}

	public boolean register(Tile tile) {
		return tileList.add(tile);
	}
	
	public boolean remove(Tile tile) {
		return tileList.remove(tile);
	}
}

