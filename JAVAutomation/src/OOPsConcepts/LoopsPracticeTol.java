package OOPsConcepts;

public class LoopsPracticeTol {
	
	public static void main(String[] args) {

		/*for (int i = 0; i < 10; i++) {
			System.out.println("The value of i: " + i);
		}*/
		
		int[] numbers = {10, 20, 30};
		/*for (int i = 0; i < numbers.length; i++) {
			System.out.println("The value of index " + i + " is: " + numbers[i]);
		}*/
		
		for (int number: numbers) { //this block is equals to the commented rows 12-14
			System.out.println("The value is: " + number);
			
		}
		
		String[] cars = {"bmw", "audi", "honda"};
		for (String car: cars) {
			System.out.println(car);
		}
	}

}
