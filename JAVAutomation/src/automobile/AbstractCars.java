package automobile;

public abstract class AbstractCars {//Abstract - hide from the users implementations of out methods (how it works); not associated and no objects can be created, but they can be extended

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int privateSpeed;
	public int publicSpeed;
	
	protected int protectedSpeed;
	
	int speedLimit = 100 ;
	
	public AbstractCars () {
		this(0);
	}
	
	public AbstractCars (int startSpeed) {
		this.privateSpeed = startSpeed;
	}
	
	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}
	
	public abstract void engineStart(String keyType, int numOfCyl);
	

}
