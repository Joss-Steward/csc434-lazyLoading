
public class IPhone7 extends DomainObject implements IDomainObject {
	private boolean hasHeadphoneJack;
	private boolean isOverpriced;
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

	public boolean getHasHeadphoneJack(){
		Load(this);
		return hasHeadphoneJack;
	}

	public boolean getIsOverpriced(){
		Load(this);
		return isOverpriced;
	}


}
