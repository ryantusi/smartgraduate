package LabBook;
import java.util.Scanner;

public class FindAreaOfTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter the width of the Triangle:"); 
		double base = scan.nextDouble(); 
		
		System.out.println("Enter the height of the Triangle:"); 
		double height = scan.nextDouble(); 
		 
		double area = (base* height)/2; 
		System.out.println("Area of Triangle is: " + area); 
	}
}
