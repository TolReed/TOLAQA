package OOPsConcepts;

public class Car {
	// color
	private String color;
	// make
	private String make;
	// model
	private String model;
	// year
	private int year;

	public void increaseSpeed() {
		speed++; //added for explain inheritance, increasing speed
		System.out.println("Increasing the speed");
	}
	
	
	public void decreaseSpeed() {
		speed--; //added for explain inheritance, decreasing speed
		System.out.println("Increasing the speed");
	}
	
	public String getMake() {
		return this.make; 
	}
	
	public void setMake(String make) { //"this" refers to the instance of the class (object)
		this.make = make;// this is a special keyword in JAVA, it accesses a member classes variable (make from 7th row), it helps assign values for tje variables
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 2000 ) {
			this.year = year;
		} else {
			System.out.println("boo, looks like this year is not valid");			
		}
	}
	
	//for constructor car 
	int speed;
	int gear;
	
	public Car() {
		//call constructor inside another constructor - something weird
		this(10, 2);
		//call constructor inside another constructor - something weird
		this.speed = 0;
		this.gear = 0;
		System.out.println("Execution constractor without arguments");
		
	}
	
	
	
	public Car(int speed, int gear) {// another constructor with parameters
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing cunstractor with arguments! HEH");
	}
	//for constructor car 

}
