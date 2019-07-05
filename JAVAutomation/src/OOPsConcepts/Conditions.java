package OOPsConcepts;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 88;
		String grade;
		
		if (score > 90){
			grade = "A";
		}
		else if (score > 80) {
			grade = "B";
		}
		else {
			grade = "C";
		}
		
		System.out.println("Score is: " + score);
		System.out.println("Grade is: " + grade);
	}

}