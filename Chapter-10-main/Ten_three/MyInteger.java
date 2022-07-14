
public class MyInteger {

	int value = 0;
	
	MyInteger(int value) {
		this.value = value;
	}
	
	public int getMyInteger() {
		return(value);
	}
	
	public boolean isEven() {
		return((value % 2) == 0);
	}
	
	public boolean isOdd() {
		return((value % 2) != 0);
	}
	
	public boolean isPrime() {
		boolean isAPrimeNumber = true;
		if (value > 0) {
			for (int i = 1; i < value; i ++) {
				if ((value % i) == 0) {
					isAPrimeNumber = false;
				}
			}
		}
		else {
			isAPrimeNumber = false;
		}
		return(isAPrimeNumber);
	}
	
	public static boolean isEven(int aValue) {
		return((aValue % 2) == 0);
	}
	
	public static boolean isOdd(int aValue) {
		return((aValue % 2) != 0);
	}
	
	public static boolean isPrime(int aValue) {
		boolean isAPrimeNumber = true;
		if (aValue > 0) {
			for (int i = 1; i < aValue; i ++) {
				if ((aValue % i) == 0) {
					isAPrimeNumber = false;
				}
			}
		}
		else {
			isAPrimeNumber = false;
		}
		return(isAPrimeNumber);
	}
	
	public static boolean isEven(MyInteger originalValue) {
		int aValue = originalValue.getMyInteger();
		return((aValue % 2) == 0);
	}
	
	public static boolean isOdd(MyInteger originalValue) {
		int aValue = originalValue.getMyInteger();
		return((aValue % 2) != 0);
	}
	
	public static boolean isPrime(MyInteger originalValue) {
		int aValue = originalValue.getMyInteger();
		boolean isAPrimeNumber = true;
		if (aValue > 0) {
			for (int i = 1; i < aValue; i ++) {
				if ((aValue % i) == 0) {
					isAPrimeNumber = false;
				}
			}
		}
		else {
			isAPrimeNumber = false;
		}
		return(isAPrimeNumber);
	}
	
	public boolean equals(int aValue) {
		return(value == aValue);
	}
	
	public boolean equals(MyInteger newInteger) {
		int aValue = newInteger.getMyInteger();
		return(value == aValue);
	}
	
	public static int parseInt(char[] characterArray) {
		String stringOfIntegers = "";
		for (int i = 0; i < characterArray.length; i++) {
			stringOfIntegers += characterArray[i];
		}
		int newInt = parseInt(stringOfIntegers);
		return(newInt);
	}
	
	public static int parseInt(String intString) {
		int newInt = Integer.valueOf(intString);
		return(newInt);
	}

}