package AutomationEXPERT;

public class Strings {
	
	public static void main(String[] args) {
		String myString = "TolRock"; // String Literal - String Constant Pool. "TolRock" - is an object and myString is a referral for this object. String myString = "TolRock" - this don't create new object, it will create reference for the same value;
		//String is the reference data type in JAVA and it's no primitive, it is a new object. Any object is stored in String Constant Pool
		
		
		String newObject = new String("TolRock! And this all what you need to know about and keep going and be awesome"); // String Object - Heap. String newObject = new String("TolRock!"); - it will create a new object, don't save memory in JAVA
		
		
		
		
		
		
		
		
		//Do some more with Strings - String Methods
		String str = "This is the test string";
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "            Spaces all around     ";
		String str6 = "Hello";
		
		System.out.println("Length of the string is: " + str.length());
		System.out.println("Character at index 2 is: " + str.charAt(2));
		System.out.println(str.concat(" This is the appended string"));
		System.out.println("Contains check 1: " + str.contains("is"));
		System.out.println("Contains check 2: " + str.contains("si"));
		System.out.println("Starts with check 1: " + str.startsWith("This"));
		System.out.println("Starts with check 2: " + str.startsWith("is"));
		System.out.println("Ends with check 2: " + str.endsWith("string"));
		System.out.println("Ends with check 2: " + str.endsWith("is"));
		System.out.println("Check contents are equal: " + str1.equals(str2));
		System.out.println("Check contents are equal: " + str1.equals(str3));		
		System.out.println("Index of 'h' is: " + str.indexOf('h'));
		System.out.println("Check if string is empty 1: " + str.isEmpty());
		System.out.println("Check if string is empty 2: " + str4.isEmpty());
		System.out.println("Trim the leading and trailing spaces: " + str5.trim());
		System.out.println("Replace Example: " + str6.replace('e', 'a'));
		
		System.out.println("Substring Example 1: " + str.substring(5));
		System.out.println("Substring Example 2: " + str.substring(5, 10));
		
		char[] charArray = str.toCharArray(); // convert all string to characters
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
		}
		
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());
		
		
		
	}

}
