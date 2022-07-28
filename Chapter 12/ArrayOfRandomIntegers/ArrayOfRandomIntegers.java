
public class ArrayOfRandomIntegers {
	
	int[] array;
	
	public int[] newArrayFiller() {
		int[] arrayOfOneHundredRandomInt = new int[100];
		for (int i = 0; i < arrayOfOneHundredRandomInt.length; i++) {
			arrayOfOneHundredRandomInt[i] = (int)(Math.random() * 100);
		}
		return(arrayOfOneHundredRandomInt);
	}
	
	public ArrayOfRandomIntegers() {
		array = newArrayFiller();
	}
	
	
	public int getArrayIndexNumber(int indexNumber) {
		return(this.array[indexNumber]);
		}
	
	}