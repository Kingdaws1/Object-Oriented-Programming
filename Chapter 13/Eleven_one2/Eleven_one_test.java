
public class Eleven_one_test {

	public static void main(String[] args) {
		
		Octagon oct1 = new Octagon(1);
		Octagon oct2 = (Octagon) (oct1.clone());
		oct1.compareTo(oct2);

	}

}
