
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The rectangle has a width of " + 
		rectangle1.width + " and a height of " + 
		rectangle1.height + ". The area of the rectangle is " + 
		rectangle1.getArea(rectangle1.width, rectangle1.height) + " and the perimeter is " + 
		rectangle1.getPerimeter(rectangle1.width, rectangle1.height));
		
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The rectangle has a width of " + 
		rectangle2.width + " and a height of " + 
		rectangle2.height + ". The area of the rectangle is " + 
		rectangle2.getArea(rectangle2.width, rectangle2.height) + " and the perimeter is " + 
		rectangle2.getPerimeter(rectangle2.width, rectangle2.height));

	}

}
