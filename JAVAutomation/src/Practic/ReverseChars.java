package Practic;

import java.util.Scanner;

public class ReverseChars {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey, if you wanna see a magic, please enter a string: ");
		String original = scan.nextLine();
		
		while (original.isEmpty() || original == null) {
			System.out.println("Please, enter a valid string, empty and null string won't be accepted in this program: ");
			original = scan.nextLine();
		}
		scan.close();
		
		ReverseChars output = new ReverseChars();
		String reverseChars = output.reverseChars(original);
		System.out.println(reverseChars);
	}
	
	private String reverseChars(String originalString) {
	
		String reverse = "";
		
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reverse = reverse + originalString.charAt(i);
		}
		return reverse;
		
	}
}