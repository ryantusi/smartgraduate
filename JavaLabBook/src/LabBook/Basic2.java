package LabBook;
import java.util.Scanner;

public class Basic2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		int a = scan.nextInt();
		
		System.out.println("Enter value of b: ");
		int b = scan.nextInt();
		
		int mul = a*b;
		System.out.println("The multiplication of a and b is: " + mul);
	}
}
