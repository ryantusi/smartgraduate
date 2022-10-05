package Day1;
import java.util.Scanner;

public class Prog18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		int temp = 0;
		
		while(num>0) {
			temp += num%10;
			temp *= 10;
			num /= 10;
		}
		//System.out.println(temp);
		System.out.println("The number in word is: ");
		
		while(temp>0) {
			num = temp%10;
			switch(num) {
			case 0:
				break;
			case 1:
				System.out.print(" one ");
				break;
			case 2:
				System.out.print(" two ");
				break;
			case 3:
				System.out.print(" three ");
				break;
			case 4:
				System.out.print(" four ");
				break;
			case 5:
				System.out.print(" five ");
				break;
			case 6:
				System.out.print(" six ");
				break;
			case 7: 
				System.out.print(" seven ");
				break;
			case 8:
				System.out.print(" eight ");
				break;
			case 9:
				System.out.print(" nine ");
				break;
			default:
				System.out.println("invalid");
			}
			temp /= 10;
		}
	}
}
