package OOPsConcepts;

public class StaticKeynotesDemo {
	
	public int addNum = 10;
	public static int addNumStatic = 10; // for row 22-24, we create static field, because we cannot use/call non-static fields
	
	//Static methods cannot use the non-static variable to method directly
	//This and super cannot be used in static context (we cannot use "this" and "super" > only names of the methods)
	public static void main(String[] args) {
		
		StaticKeynotesDemo s1 = new StaticKeynotesDemo();//create object of the class in the same class itself
		int output = s1.sum(20); // we added s1.sum(10) instead of sum(10);
		int staticOutput = sumStatic(10);
		System.out.println("The output is " + output);
		System.out.println("The output is " + staticOutput);
	}
	
	public int sum(int num) {//don't exist unless he class is executed/loaded in JVM
		return num + addNum;
	
	}
	
	public static int sumStatic(int num) {
		return num + addNumStatic;
		
	}

}
