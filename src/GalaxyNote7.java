/**
 * 
 * @author Joss Steward, Drew Rife, Brad Olah
 * 
 * GlaxyNote7 class that implements the interface IDomainObject 
 *
 */
public class GalaxyNote7 extends DomainObject implements IDomainObject { 
	private boolean explodes;
	private boolean isBurntPaperWeight;
	private int price;

	@Override
	public void Load(DomainObject obj) {
		// TODO Auto-generated method stub
	}

	@Override
	public void Save(DomainObject obj) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @return the price
	 */
	public int getPrice() {
		Load(this);
		return price;
	}

	/**
	 * @return the burnt paper weight
	 */
	public boolean getExploded(){
		Load(this);
		return isBurntPaperWeight;
	}

	/**
	 * @return it will definitely explode
	 */
	public boolean getMightExplode(){
		Load(this);
		return explodes;
	}


}
