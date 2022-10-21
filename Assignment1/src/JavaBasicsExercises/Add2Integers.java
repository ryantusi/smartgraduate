package JavaBasicsExercises;
import java.util.Scanner;

public class Add2Integers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int sum = a+b;
		System.out.println("The sum is: " + sum);
	}
}
