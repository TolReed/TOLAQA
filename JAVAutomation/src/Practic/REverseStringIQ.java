package Practic;

public class REverseStringIQ {
	
		public static void main(String[] args) {
			String input = "this is a test string";
			String output = reverse(input);
			System.out.println(output);
		}
		
		// There is no built-in reverse method for strings in Java
		// There is one with String Builder, which does not give the output we want
		private static String reverse(String input) {
			String reverse = ""; //placeholder for the string
			
			if (input == null || input.isEmpty()) {// we need to verify condition if our string is not empty one
				System.out.println("Empty and null strings are not accepted");
			}
			
			if (input.length() <= 1) {//go thought all words in our string
				reverse = input;
			} else {
				String[] originalArray = input.split("\\s+"); // create an array to store words in our string, "\\s+" - split the spaces in string
				
				for (String item : originalArray) { // this, is, a, test, string
					reverse = item + " " + reverse; // this + "", is + this, a + is this, test + a is this, string + test a is this
				}
			}
			
			return reverse.trim();//remove whitespace in the string
		}
	}