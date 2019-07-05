package automobile;

public class BMW extends Cars{

	public BMW (int startSpeed) {
		super(startSpeed);//get constructor from super class and set value
		
	}
		
	public void increaseSpeed() {//or right click Source > Override/Implement Methods > select from the list (shows the parent class, because it extended, rows 20-32)
		//super.increaseSpeed();
		protectedSpeed++;
		Cars c1 = new Cars();
		c1.decreaseSpeed();
		System.out.println("Increasing speed of BMW");
	}

	public void headupDisplayNavigation() {
		System.out.println("BMW specific functionality");
		
	}
	
	public void stop() {
		Cars c1 = new Cars();
		c1.decreaseSpeed();
	}
/*
	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		super.increaseSpeed();
	}

	@Override
	public void decreaseSpeed() {
		// TODO Auto-generated method stub
		super.decreaseSpeed();
	}

*/
}
