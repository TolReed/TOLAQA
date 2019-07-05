package automobile;

//1. we can always override functionality in parent class,- 2. assign the parent class reference to the child class object - 3. own/specifically implementation

/***
 * Rules
 * 1. Arguments List: Arguments list in the overriding method should be same as the parent class overridden method
 * 2. Access Modifier: Access modifier of the overriding method cannot be more restrictive than the overridden method - cannot change public to private, but if we want increase it - it's fine - change to protected, we cannot reduce
 * 3. private, static and final methods cannot be overridden as they are local to the class
 */

 public class CarsOverridingChildBMW extends CarsOverridingParent {

	public static void main(String[] args) {
		CarsOverridingParent c1 = new CarsOverridingChildBMW();//reference of parent on child class - dynamic object
		c1.increaseSpeed();
		c1.engineStart(2);
	}
	
	@Override
	public void engineStart(int cyl) {//we cannot change parameters (have different arguments) if we want to override method parent class in child
		super.engineStart(2);//if comment it, we won't print from parent class
		System.out.println("I am from the child class");
	}
	
	public static void staticExample() {//it's not override, it is the same thing, cannot call staticExample from the super class
		System.out.println("I am the static method from the child class");
	}

	
	
}