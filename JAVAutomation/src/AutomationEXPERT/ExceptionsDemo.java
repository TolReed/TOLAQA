package AutomationEXPERT;

import java.sql.SQLException;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		//try code (run it), if catch exception - goes to catch block
		try {
			System.out.println("1st line");
			acc.withdraw(100);//not executed because catch an exception - so go to catch block
			System.out.println("After trying the withdraw method");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()); //returns - No suitable driver found for jdbc:mysql://localhost:3306/
			System.out.println("Try again at some other point");
		}
		finally {
			System.out.println("Allways executes");
		}

	}

}