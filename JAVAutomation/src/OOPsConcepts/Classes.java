package OOPsConcepts;

public class Classes { //1. classes are template which we use to create objects
	
	//define an object, because all in oop is object
	//car as an object can have color, make, model, year, price = all of those are states/attributes of the car object
	//behavior of the object is the second thing = how fast is, increase speed, put it to stop, start engine, decrease a speed ...
	

	public static void main(String[] args) {
		Car bmw = new Car(); // create and initialize the object Car
		bmw.setMake("BMW"); //every class inherits from the object Class, if I have public static in some other file, it will inherit here
		System.out.println("The make of the BMW is " + bmw.getMake());
		System.out.println("The model of the BMW is " + bmw.getModel());// null is default value for the String, if we no set any value 
				
		Car benz = new Car();
		benz.setModel("Benz");
		System.out.println("The make of the benz is " + benz.getModel());
		
		benz.setModel("c300");
		System.out.println("The model of the benz is " + benz.getModel());
		
		benz.setYear(2017);
		System.out.println("The year of the benz is " + benz.getYear());
	}
}
