import java.util.ArrayList;
import java.util.Scanner;

public class MenuItems {

	String item1Name = "";
	String item2Name = "";
	String item3Name = "";
	ArrayList<String> item1IngredientsArray = new ArrayList<>();
	ArrayList<String> item2IngredientsArray = new ArrayList<>();
	ArrayList<String> item3IngredientsArray = new ArrayList<>();
	double totalCostOfItem1 = 0.0;
	double totalCostOfItem2 = 0.0;
	double totalCostOfItem3 = 0.0;
	double salePriceOfItem1 = 0.0;
	double salePriceOfItem2 = 0.0;
	double salePriceOfItem3 = 0.0;
	
	public MenuItems() {
		String item1Name = "";
		String item2Name = "";
		String item3Name = "";
		ArrayList<String>[] item1IngredientsArray;
		ArrayList<String>[] item2IngredientsArray;
		ArrayList<String>[] item3IngredientsArray;
		double totalCostOfItem1 = 0.0;
		double totalCostOfItem2 = 0.0;
		double totalCostOfItem3 = 0.0;
		double salePriceOfItem1 = 0.0;
		double salePriceOfItem2 = 0.0;
		double salePriceOfItem3 = 0.0;
	}
	
	public void setItem1Name(String newItem1Name) {
		this.item1Name = newItem1Name;
	}
	
	public void setItem2Name(String newItem2Name) {
		this.item2Name = newItem2Name;
	}
	
	public void setItem3Name(String newItem3Name) {
		this.item3Name = newItem3Name;
	}
	
	public String getItem1Name() {
		return(this.item1Name);
	}
	
	public String getItem2Name() {
		return(this.item2Name);
	}
	
	public String getItem3Name() {
		return(this.item3Name);
	}
	
	public void setItem1IngredientsArray() {
		boolean finished = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ingredients of " + this.getItem1Name() + ".");
		while (finished == false) {
			System.out.print("Enter an ingredient in " + this.getItem1Name() + " \n "
					+ "or enter 'finished' when done: ");
			String userIngredient = input.next();
			if (userIngredient.equalsIgnoreCase("finished")) {
				finished = true;
			}
			else {
				this.item1IngredientsArray.add(userIngredient);
			}
		}
	}
	
	public void setItem2IngredientsArray() {
		boolean finished = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ingredients of " + this.getItem2Name() + ".");
		while (finished == false) {
			System.out.print("Enter an ingredient in " + this.getItem2Name() + " \n "
					+ "or enter 'finished' when done: ");
			String userIngredient = input.next();
			if (userIngredient.equalsIgnoreCase("finished")) {
				finished = true;
			}
			else {
				this.item2IngredientsArray.add(userIngredient);
			}
		}
	}
	
	public void setItem3IngredientsArray() {
		boolean finished = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ingredients of " + this.getItem3Name() + ".");
		while (finished == false) {
			System.out.print("Enter an ingredient in " + this.getItem3Name() + " \n "
					+ "or enter 'finished' when done: ");
			String userIngredient = input.next();
			if (userIngredient.equalsIgnoreCase("finished")) {
				finished = true;
			}
			else {
				this.item3IngredientsArray.add(userIngredient);
			}
		}
	}
	
	public void setTotalCostOfItem1(double newTotalCostOfItem1) {
		this.totalCostOfItem1 = newTotalCostOfItem1;
	}
	
	public void setTotalCostOfItem2(double newTotalCostOfItem2) {
		this.totalCostOfItem2 = newTotalCostOfItem2;
	}
	
	public void setTotalCostOfItem3(double newTotalCostOfItem3) {
		this.totalCostOfItem3 = newTotalCostOfItem3;
	}
	
	public double getTotalCostOfItem1() {
		return(this.totalCostOfItem1);
	}
	
	public double getTotalCostOfItem2() {
		return(this.totalCostOfItem2);
	}
	
	public double getTotalCostOfItem3() {
		return(this.totalCostOfItem3);
	}
	
	public void setSalePriceOfItem1(double newSalePriceOfItem1) {
		this.salePriceOfItem1 = newSalePriceOfItem1;
	}
	
	public void setSalePriceOfItem2(double newSalePriceOfItem2) {
		this.salePriceOfItem2 = newSalePriceOfItem2;
	}
	
	public void setSalePriceOfItem3(double newSalePriceOfItem3) {
		this.salePriceOfItem3 = newSalePriceOfItem3;
	}
	
	public double getSalePriceOfItem1() {
		return(this.salePriceOfItem1);
	}
	
	public double getSalePriceOfItem2() {
		return(this.salePriceOfItem2);
	}
	
	public double getSalePriceOfItem3() {
		return(this.salePriceOfItem3);
	}

}
