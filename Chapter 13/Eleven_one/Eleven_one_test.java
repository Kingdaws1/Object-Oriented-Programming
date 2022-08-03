
public class Eleven_one_test {

	public static void main(String[] args) {
		
		Triangle[] arrayOfTriangles = new Triangle[5];
		for (int i = 0; i < 5; i++) {
			arrayOfTriangles[i] = new Triangle();
		}
		for (int j = 0; j < arrayOfTriangles.length; j++) {
			System.out.println("Triangle " + j);
			System.out.println("Area: " + arrayOfTriangles[j].getArea());
			System.out.print("How to Color: ");
			arrayOfTriangles[j].howToColor();
		}

	}

}
