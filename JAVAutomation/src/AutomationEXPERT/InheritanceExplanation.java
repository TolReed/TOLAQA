package AutomationEXPERT;

import automobile.BMW;
import automobile.Cars;

public class InheritanceExplanation {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int speed = 0;
		
		
		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		bmw1.headupDisplayNavigation();

	}

}
