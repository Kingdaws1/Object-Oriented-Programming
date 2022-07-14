
public class Test_MyInteger {

	public static void main(String[] args) {
		MyInteger integerBob = new MyInteger(21);
		System.out.println(integerBob.getMyInteger());
		System.out.println("number is even? " + integerBob.isEven());
		System.out.println("number is odd? " + integerBob.isOdd());
		System.out.println("number is prime? " + integerBob.isPrime());
		System.out.println("number 13 is even? " + MyInteger.isEven(13));
		System.out.println("number 13 is odd? " + MyInteger.isOdd(13));
		System.out.println("number 13 is prime? " + MyInteger.isPrime(13));
		System.out.println("integerBob is even? " + MyInteger.isEven(integerBob));
		System.out.println("integerBob is odd? " + MyInteger.isOdd(integerBob));
		System.out.println("integerBob is prime? " + MyInteger.isPrime(integerBob));
		System.out.println("integerBob number == 13? " + integerBob.equals(13));
		System.out.println("integerBob == integerBob? " + integerBob.equals(integerBob));
		char[] aCharacterArray = {'1', '2'};
		System.out.println("Character Array to int = " + MyInteger.parseInt(aCharacterArray));
		System.out.println("String to int = " + MyInteger.parseInt("21"));

	}

}
