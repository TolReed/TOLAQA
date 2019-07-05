package AEXPERT;

public class RunTimeExeption {
	
	public static void main(String[] args) {
	
	
	/*	int a = 10;
		int b = 0;
		try {
			c = a / b;
			}
		catch (ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println("WOW, division by zero is not allowed. Please, try again later");
		}
	*/
		int[] numbers = {1, 2, 3};
		try {
		for (int i = 0; i <=3; i++) {//if change to i<3 we will always get exception block executed as result of run
			System.out.println(numbers[i]);
			}
		}
		catch (Exception e) {
			System.out.println("There is no index available after 2");
			System.out.println(e.getLocalizedMessage());
		}
	}

}