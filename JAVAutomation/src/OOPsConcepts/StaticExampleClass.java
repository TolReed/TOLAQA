package OOPsConcepts;

public class StaticExampleClass {
	private static int wheelsCount = 4;//we predict that all cars have 4 wheels (might have some exceptions but this is not a matter now)
	private String make;
	private static int instanceNum = 0; //static - not related to the object > associated with the class (common staff - not changes with an instances of the class - one copy of variable in the memory, belong to the class not to the object),
	
	public StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;
	}
	
	public String getMake() {
		return make;
	}
	
	public static int getInstanceNum() {
		return instanceNum;
	}

	public static int getWheelsCount() {
		return wheelsCount;
	}

	public static void setWheelsCount(int wheelsCount) {
		StaticExampleClass.wheelsCount = wheelsCount;
	}

}
