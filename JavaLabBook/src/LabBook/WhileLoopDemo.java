package LabBook;
import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int number, sum = 0; 
		Scanner scan = new Scanner(System.in); 
		 
		System.out.println("Enter any integer value below 10: "); 
		number = scan.nextInt(); 
		 
		while (number <= 10) { 
			sum = sum + number; 
			number++; 
		} 
		System.out.format("Sum From the While Loop is: %d ", sum);
	}
}
