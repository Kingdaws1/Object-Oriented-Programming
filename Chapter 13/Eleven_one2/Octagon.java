
public class Octagon extends GeometricObject implements Cloneable, Compareable {

	double side = 1;
	double area = (2 + (4 / (Math.sqrt(2))) * side * side);
	
	public Octagon() {
		this.side = 1;
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public void setSide(double newSide) {
		this.side = newSide;
	}
	public double getSide() {
		return(this.side);
	}
	public double getArea() { 
		return(this.area);
	}
	@Override
	public Object clone() {
		try {return super.clone();}
		catch (CloneNotSupportedException ex) {
			return null;
		}
		
	}
	@Override
	public int compareTo(Octagon o) {
		if (area > o.getArea()) {
			return(1);
		}
		else if (area < o.getArea()) {
			return(-1);
		}
		else {
			return(0);
		}
	}

}
