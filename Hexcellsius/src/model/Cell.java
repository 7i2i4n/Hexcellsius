package model;

public class Cell extends Tile {
	 /**
	  * Version of a Hexcell with a Number
	  */
	public Cell(int x, int y, int value, CellRules cellrule)
	{
		super(x,y);
		setValue(value);
		this.cellrule = cellrule;
	}
	
	private CellRules cellrule;
	private int value;
	
	public CellRules getCellrule() {
		return cellrule;
	}

	public void setCellrule(CellRules cellrule) {
		this.cellrule = cellrule;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if(value <= 0 || value >5)
		{
			throw new IllegalArgumentException("Value must be between 0 and 5");
		}
		this.value = value;
	}

}
