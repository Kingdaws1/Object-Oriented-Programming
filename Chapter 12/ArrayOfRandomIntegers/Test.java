import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayOfRandomIntegers array1 = new ArrayOfRandomIntegers();
		while (true) {
			System.out.println("Enter an index number between 0 and 99" + "\n" 
			+ "to get the integer stored in the array.");
			int userIndex = input.nextInt();
			try {
			System.out.println(array1.getArrayIndexNumber(userIndex));
			}
			catch (IndexOutOfBoundsException e) {
				System.out.println("Your number was out of the bounds of the array.");
			}
		}

	}

}
