package LabBook;
import java.util.Scanner;

public class FindAreaOfSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the side of square: ");
		double side = scan.nextDouble(); 
		
		double area = side*side; 
		System.out.println("Area of Square is: " + area); 
	}
}
