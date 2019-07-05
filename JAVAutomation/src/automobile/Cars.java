package automobile;

public class Cars {
	// No Modifier - accessible in the same package
	int speed;
	// Only in class
	@SuppressWarnings("unused")
	private int privateSpeed;
	
	// Anywhere in Java World with importing the package and class
	public int publicSpeed;
	
	// In same package and in sub classes
	protected int protectedSpeed;
	
	int speedLimit = 100 ;
	
	public Cars () {
		this(0);
	}
	
	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}

	public Cars (int startSpeed) {
		this.privateSpeed = startSpeed;
	}
		
	public void increaseSpeed() {
		if (speed < 100) {
			speed++;
		}
		System.out.println("Increasing Speed of Cars ");
	}
	
	protected void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of Cars");
	}
	
	
/* old code
 * 
 * 	int speed;
	
	public Cars (int startSpeed) {
		speed = startSpeed;
		
	}

	public void increaseSpeed() {
		speed++; //added for explain inheritance, increasing speed
		System.out.println("Increasing the speed of Cars");
	}
	
		public void decreaseSpeed() {
		speed--; //added for explain inheritance, decreasing speed
		System.out.println("Decreasing the speed of Cars");
	}
*/	

}
