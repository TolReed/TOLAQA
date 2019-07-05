package OOPsConcepts;

public class StaticKeyword {
	
	public static void main(String[] args) {
		//static variable associated with classes not of the objects in the classes
		StaticExampleClass s1 = new StaticExampleClass("bmw"); //created two objects, this is first
		System.out.println("Make of Car is: " + s1.getMake());
		System.out.println("This is intance no: " + StaticExampleClass.getInstanceNum());
		
		StaticExampleClass s2 = new StaticExampleClass("benz"); //created two objects, this is second
		System.out.println("Make of Car is: " + s2.getMake());
		System.out.println("This is intance no: " + StaticExampleClass.getInstanceNum());
		
	}

}
