import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void nthFibonacciPozitive() {
        assertEquals(-3, fibonacci.NthFibonacci(-4));
    }

    @Test
    public void nthFibonacciNegative() {
        assertEquals(5, fibonacci.NthFibonacci(5));
    }

    @Test
    public void nthFibonacciOne() {
        assertEquals(1, fibonacci.NthFibonacci(1));
    }

    @Test
    public void nthFibonacciZero() {
        assertEquals(0, fibonacci.NthFibonacci(0));
    }
}