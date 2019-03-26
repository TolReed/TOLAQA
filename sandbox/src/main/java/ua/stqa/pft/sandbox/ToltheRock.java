package ua.stqa.pft.sandbox;

public class ToltheRock {
	
	public static void main(String[] args) {
		//TODO auto-generated (was't auto-generated, I create it by myself)
		//hi("Tol");
		//System.out.println(1/2);
		//System.out.println(11.0/2.0);
		//System.out.println(111/2.0);
		//types of variables in JAVA!!!
		//byte : byte myByte = 100 (-128 to 127, default is 0);
		//short : short myShort = 30121 (-32768 to 32767, default is 0);
		//int : int myInteger = 777777L (-2147483648 to 2147483647, default is 0);
		//long : long myLong = 235456754231 (-2^63 to 2^63, default is 0);
		//float : float myFloat = 0.7f (0.0f, default is 0);
		//double : double myDouble = 77.7 (0.0d, default is 0, default decimal digit!);
		//boolean : boolean booleanVariable = true (false or true, default is false);
		//char : char myCharacter = "TolRock" (Min 0 and Max 65535);
		Square s = new Square(6);
		//s.l = 6;
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());//or area(s); in a case we refer to the function inside Square (without *this* part)

		Rectangle r = new Rectangle(4, 6);
		//r.a = 4;
		//r.b = 6;
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b +  " = " + r.area());//or area(r); in a case we refer to the function inside Rectangle (without *this* part)


	}

	/*
	public static void hi(String s) {
		System.out.println("Hey, there. How it's going? " + s);
		System.out.println("Quality in details, work, work, work! Don't forget to chill!");
		System.out.println("Be the ROCK");

	}
	*/
}