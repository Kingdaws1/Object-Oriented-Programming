import java.util.Date;

public class GeometricObject {

	Date dateCreated = new Date();
	String color = "white";
	boolean filled = false;
	
	public String getColor() {
		return(color);
	}
	
	public boolean getFilled() {
		return(filled);
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setFilled(String newFilled) {
		if (newFilled.equalsIgnoreCase("true")) {
			filled = true;
		}
		else {
			filled = false;
		}
	}

}
