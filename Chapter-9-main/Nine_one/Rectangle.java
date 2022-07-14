
class Rectangle {

	double width = 1;
	double height = 1;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	double getArea(double width, double height) {
		return(width * height);
	}
	
	double getPerimeter(double width, double height) {
		return((width * 2) + (height * 2));
	}
	
}
