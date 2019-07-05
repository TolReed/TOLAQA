package OOPsConcepts;

public class Methods {
	
	//static String a = "TolRock!";
	//System.out.println(a); // this is an error, because we cannot call anything in methods, no actions to perform! only define or declare variables!!!
	public static void main (String[] args) {
		String a = "Hey, there! TolRock!";
		//System.out.println(a); 
		String grade;
		String StudentName; // don't hardcore any values, if it possible to create variable and store data there > always use it
		
		StudentName = "Tol";
		grade = findGrades(88);
		displayGrades(StudentName, grade);
		
		StudentName = "Den";
		grade = findGrades(93);
		displayGrades(StudentName, grade);
		
		StudentName = "Ana";
		grade = findGrades(77);
		displayGrades(StudentName, grade);
		
		
		}
	
	public static String findGrades(int score) { // we defined string variable and int score which will be used for our function
		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade; // change public static void (row 16) to public static String
		
		//System.out.println("Grade of " + studentName + " is: " + grade);
	}
		
	public static void displayGrades(String studentName, String grade) {
		System.out.println("*******************************");
		System.out.println("Grade of " + studentName + " is: " + grade);
		System.out.println("*******************************");
	}
}
