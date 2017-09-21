package pkgBase;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int myInt) {
		setiValue(myInt);
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public static boolean isEven(int value) {
		return (value % 2 == 0 ? true : false);
	}

	public static boolean isOdd(int value){
		return !isEven(value);
	}

	public static boolean isPrime(int value) {
		boolean prime = true;
		for (int i = 1; i < value; i++) {
			if ((value % i == 0) && prime) {
				prime = false;
			}
		}
		return prime;	
	}
	
	
	
	public static boolean isEven(MyInteger myInt) {
		return (myInt.getiValue() % 2 == 0 ? true : false);
	}

	public static boolean isOdd(MyInteger myInt){
		return !isEven(myInt.getiValue());
	}

	public static boolean isPrime(MyInteger myInt) {
		boolean prime = true;
		for (int i = 1; i < myInt.getiValue(); i++) {
			if ((myInt.getiValue() % i == 0) && prime) {
				prime = false;
			}
		}
		return prime;	
	}
	
	
	public boolean equals(int value) {
		return (value == this.iValue);
	}
	
	public boolean equals(MyInteger myInt) {
		return (myInt.getiValue() == this.iValue);
	}
	
}
