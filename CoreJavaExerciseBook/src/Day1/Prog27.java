package Day1;
import java.util.Scanner;

public class Prog27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//taking input as investment amount
		System.out.println("Enter invested amount: ");
		final double investment = scan.nextDouble();
		
		//creating a variable to calculate the investment 
		double value = investment;
		
		//value in first year
		value += investment*0.4;		
		System.out.println("First year 40% increase in value: " + value);
		
		//value in second year 
		value -= 1500;
		System.out.println("Second year 1500 decrease in value: " + value);
		
		//value in third year, considering the 20% of the current value not the original investment
		value += value*0.2;
		System.out.println("Thrd year 20% increase in value: " + value);
		
	}
}
