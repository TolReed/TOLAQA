package OOPsConcepts;

public class WhileLoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i = 10; int j = 10;
		
		while (i < 20) { //checks condition and executes 
			System.out.println("The value of i: " + i);
			i++;
			if (i == 17) {
				continue; //you can use break - it will stop loop at 16
			}
			
			System.out.println("The value of i: " + i);
			i++;
		}
		System.out.println("Outside the loop...");
	
	do { //condition executed first time always and after that checks the conditions
		System.out.println(j + " this is do>while loop example for practice");
		j++;
		
	} while (j < 10);

	}

}
