package ua.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

    @Test
    public void testPrimes () {
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }

    @Test
    public void testPrimesFast () {
        Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
    }

    @Test (enabled = false) //відключаємо тест
    public void testNonPrimes () {
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE - 2));
    }

    @Test (enabled = false) //відключаємо тест
    public void testNonPrimesLong () {
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrime(n));
    }


}
