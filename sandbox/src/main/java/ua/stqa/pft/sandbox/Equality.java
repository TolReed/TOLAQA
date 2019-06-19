package ua.stqa.pft.sandbox;

public class Equality {

    public static void main (String[] args) {
        String s1 = "firefox 2.0";

        String s2 = new String(s1);
                 // або =s1; = "firefox " + Math.sqrt(4,0);

        System.out.println(s1 == s2); //перевірка ссилки на об"єкт, скопірувалася ссилка а існуючий об"єкт, фізичне порівняння
        System.out.println(s1.equals(s2)); //створився новий об"єкт, тому йде перевірка двох об"єктів, їх значень, ссилаються на різні об"єкти, логічне порівняння

    }
}
