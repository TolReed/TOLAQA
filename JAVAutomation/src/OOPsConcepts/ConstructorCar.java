package OOPsConcepts;

public class ConstructorCar { //JAVA has a default no argument constructor
	
	public static void main(String[] args) {
		Car c1 = new Car();
		
		c1.setMake("TOYOTA");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		
		System.out.println("*************new cunstractor below - with arguments*******************");
		Car c2 = new Car(10, 55);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
		
		//Different default values for different objects, this is how constructor works! amazing
	} 

}
