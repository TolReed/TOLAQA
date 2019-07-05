package AutomationEXPERT;

public class Arrays {
	
	public static void main(String[] args) {
		int[] myIntArray; // no create an array, just a referrence for an array 
		myIntArray = new int[10]; //add new space of integers - 10, no array, 
		myIntArray[0] = 100;
		myIntArray[1] = 30;
		myIntArray[2] = 55;
		
		System.out.println("0 index " + myIntArray[0]);
		System.out.println("1st index " + myIntArray[1]);
		System.out.println("2nd index " + myIntArray[3]);
		
		
		String[] myStringArray = {"bmw", "audi", "toyota"}; // if call indeex outside of array you will get exeption!
		
		System.out.println("0 index " + myStringArray[0]);
		System.out.println("1st index " + myStringArray[1]);
		System.out.println("2nd index " + myStringArray[2]);
		
		int len1 = myIntArray.length;
		int len2 = myStringArray.length;
		
		System.out.println("Int array length is " + len1);
		System.out.println("String array length is " + len2);
		
		
		for (int i = 0; i < len1; i++) {
			
			System.out.println(myIntArray[i]); //print all 10 digits in array, all no-existing ones will be replaced by 0
			
		}
	}

}
