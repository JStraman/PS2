import static org.junit.Assert.*;

import org.junit.Test;

import pkgBase.MyInteger;

public class MyInteger_Test {

	@Test
	public void testIsEven() {
		int i = 2;
		assertTrue(MyInteger.isEven(i));
	}

	@Test
	public void testIsEvenMyInt() {
		MyInteger myInt = new MyInteger(2);
		assertTrue(MyInteger.isEven(myInt));
	}
	
	@Test
	public void testIsOdd() {
		int i = 3;
		assertTrue(MyInteger.isOdd(i));
	}

	@Test
	public void testIsOddMyInt() {
		MyInteger myInt = new MyInteger(3);
		assertTrue(MyInteger.isOdd(myInt));
	}	
	
	@Test
	public void testIsPrime() {
		int i = 3;
		assertTrue(MyInteger.isPrime(i));
	}

	@Test
	public void testIsPrimeMyInt() {
		MyInteger myInt = new MyInteger(3);
		assertTrue(MyInteger.isPrime(myInt));
	}
	
	@Test
	public void testEquals() {
		int i = 3;
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.equals(i));
	}
	
	@Test
	public void testEqualsMyInt() {
		MyInteger myInt1 = new MyInteger(3);
		MyInteger myInt2 = new MyInteger(3);
		assertTrue(myInt1.equals(myInt2));
	}
}
