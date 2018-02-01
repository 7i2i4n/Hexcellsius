package control;

import model.Tile;

public class TileManager {
	/**
	 * Class for creation and managing of Tiles
	 */
	private TileRegister tileRegister;
	
	public TileManager()
	{
		tileRegister = TileRegister.getInstance();
	}
	
	public void createTile(int x, int y) {
		new Tile(x,y);
	}
	
	
	
	public void connect ()
	{
		
	}
	
	
}
