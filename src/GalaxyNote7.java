
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

	public int getPrice() {
		Load(this);
		return price;
	}

	public boolean getExploded(){
		Load(this);
		return isBurntPaperWeight;
	}

	public boolean getMightExplode(){
		Load(this);
		return explodes;
	}


}
