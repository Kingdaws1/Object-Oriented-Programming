import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FileCreatorAndReader {

	public static void main(String[] args) throws FileNotFoundException {
		int random = 0;
		int count = 0;
		int[] array = new int[100];
		File file = new File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		try (
				PrintWriter output = new PrintWriter(file)
					) {
			for (int i = 0; i < 100; i++) {
				random = (int)(Math.random() * 100);
				array[i] = random;
				output.print(random + " ");
			}
			output.close();
		}
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			array[count] = input.nextInt();
			count++;
		}
		input.close();
		Arrays.sort(array);
		String ascendingOrder = "";
		for (int j = 0; j < array.length; j++) {
			ascendingOrder += array[j];
			ascendingOrder += " ";
		}
		System.out.println(ascendingOrder);

	}

}
