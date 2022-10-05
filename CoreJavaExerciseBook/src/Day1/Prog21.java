package Day1;
import java.util.Scanner;

public class Prog21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the month in number: ");
		int month = scan.nextInt();
		System.out.println("Enter year to check leap year: ");
		int year = scan.nextInt();
		
		switch(month) {
		case 1: 
			System.out.println("January - 31 days");
			System.out.println(year);
			break;
		case 2:
			if(year%4==0) {
				System.out.println("Febraury - 29 days");
				System.out.println(year + " (Leap Year)");
			}else {
				System.out.println("Febraury - 28 days");
				System.out.println(year);
			}
			break;
		case 3:
			System.out.println("March - 31 days");
			System.out.println(year);
			break;
		case 4:
			System.out.println("April - 30 days");
			System.out.println(year);
			break;
		case 5:
			System.out.println("May - 31 days");
			System.out.println(year);
			break;
		case 6:
			System.out.println("June - 30 days");
			System.out.println(year);
			break;
		case 7: 
			System.out.println("July - 31 days");
			System.out.println(year);
			break;
		case 8:
			System.out.println("August - 31 days");
			System.out.println(year);
			break;
		case 9:
			System.out.println("September - 30 days");
			System.out.println(year);
			break;
		case 10:
			System.out.println("October - 31 days");
			System.out.println(year);
			break;
		case 11:
			System.out.println("November - 30 days");
			System.out.println(year);
			break;
		case 12:
			System.out.println("December - 31 days");
			System.out.println(year);
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
