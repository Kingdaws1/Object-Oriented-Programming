import java.util.Scanner;

public class Eleven_one_test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		Triangle triangle1 = new Triangle(side1, side2, side3);
		System.out.println("Input the color of the triangle: ");
		String color = input.next();
		triangle1.setColor(color);
		System.out.println("Triangle is filled? Type true or false: ");
		String filled = input.next();
		triangle1.setFilled(filled);
		System.out.println("Area = " + triangle1.getArea() + "\n"
				+ "Perimeter = " + triangle1.getPerimeter() + "\n"
				+ "Color = " + triangle1.getColor() + "\n"
				+ "Filled = " + triangle1.getFilled() + "\n"
				+ "Date Created = " + triangle1.dateCreated);

	}

}
