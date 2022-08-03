
public class Triangle extends GeometricObject implements Colorable{

	double side1 = 1;
	double side2 = 1;
	double side3 = 1;

	public Triangle() {
		
	}
	
	public Triangle(double newSide1, double newSide2, double newSide3) {
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
	}
	
	public double getSide1() {
		return(side1);
	}
	
	public double getSide2() {
		return(side2);
	}
	
	public double getSide3() {
		return(side3);
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double areaBeforeSquared = s * (s - side1) * (s - side2) * (s - side3);
		double area = Math.sqrt(areaBeforeSquared);
		return(area);
	}
	
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return(perimeter);
	}
	
	public String toString() {
		return("Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
	}
	
	public void howToColor() {
		System.out.println("Color all three sides");
	}
	
}
