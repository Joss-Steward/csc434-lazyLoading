
public class GalaxyNote7 extends DomainObject implements LazyLoadify {
	private boolean explodes;
	private boolean isBurntPaperWeight;
	private int price;
	private String name;

	@Override
	public void Load(DomainObject obj) {
		// TODO Auto-generated method stub
	}

	@Override
	public void Save(DomainObject obj) {
		// TODO Auto-generated method stub

	}

	public void setExploded(boolean exploded) {
		Load(this);
		isBurntPaperWeight = exploded;
		Save(this);
	}

	public boolean getExploded(){
		Load(this);
		return isBurntPaperWeight;
	}

	public void setMightExplode(boolean mightExplode){
		Load(this);
		explodes = mightExplode;
		Save(this);
	}


}
