package ua.stqa.pft.sandbox;

public class Primes { // визначення простоти цілого числа, просте число ділиться на себе і на одиницю

    public static boolean isPrime (int n) {
        for (int i = 2; i < n; i = i + 1) {
            if (n % i == 0) {
                return false; //знайшли просто число, закінчуємо операцію
            }
        }
        return true; // знайшли не просто число

    }

    public static boolean isPrime (long n) {
        for (int i = 2; i < n; i = i + 1) {
            if (n % i == 0) {
                return false; //знайшли просто число, закінчуємо операцію
            }
        }
        return true; // знайшли не просто число

    }

    public static boolean isPrimeWhile (int n) {
        int i = 2;
        while (i < n) { // або while (i < n && n % i !=0) - тоді не треба if
            if (n % i == 0) {
                return false; //знайшли просто число, закінчуємо операцію
            }
            i++;
        }
        return true; // знайшли не просто число

    }

    public static boolean isPrimeFast (int n) {
        int m = (int) Math.sqrt(n); //преобразуємо до цілого числа
        for (int i = 2; i < m; i = i + 1) {
            if (n % i == 0) {
                return false; //знайшли просто число, закінчуємо операцію
            }
        }
        return true; // знайшли не просто число

    }
}
//public static boolean isPrimeWhile (int n) {
//int i = 2;
// while (i < n && n % i !=0) {
// i++;
// }
// return i == n;
//}