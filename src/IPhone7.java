/**
 * 
 * @author Joss Steward, Drew Rife, Brad Olah
 * 
 * Iphone7 class that iplemets IDomainObject
 *
 */
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

	/**
	 * @return the outrageous price
	 */
	public int getPrice() {
		Load(this);
		return price;
	}

	/**
	 * @return false since it doesn't have a headphone jack
	 */
	public boolean getHasHeadphoneJack(){
		Load(this);
		return hasHeadphoneJack;
	}

	/**
	 * @return true because it is overpriced 
	 */
	public boolean getIsOverpriced(){
		Load(this);
		return isOverpriced;
	}
}
