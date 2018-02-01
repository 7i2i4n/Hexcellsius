package control;

import java.util.ArrayList;
import java.util.List;

import model.Tile;

public class TileRegister {
	/**
	 * When a Tile is created, it is registerd in the TileRegister. It serves as a
	 * complete Overview of all Tiles. TileRegister is a Singleton.
	 */

	private static TileRegister instance;
	private List<Tile> tileList;

	/**
	 * 
	 * @return Returns the Instance of TileRegister
	 */
	public static TileRegister getInstance() {
		if (TileRegister.instance == null) {
			return new TileRegister();
		}

		return TileRegister.instance;
	}

	private TileRegister() {
		this.tileList = new ArrayList<Tile>();
	}

	/**
	 * Returns all Tiles in the List
	 * 
	 * @return tileList
	 */
	public List<Tile> getAll() {
		return tileList;
	}

	public boolean register(Tile tile) {
		return tileList.add(tile);
	}

	public boolean remove(Tile tile) {
		return tileList.remove(tile);
	}
}
