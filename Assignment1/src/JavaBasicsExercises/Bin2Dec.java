package JavaBasicsExercises;
import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter binary string: ");
		String str = scan.next();
		
		int result = 0, n = 2;
		int r;
		int len = str.length();
		char c;
		boolean flag = false;
		
		for(int i=0; i<len; i++) {
			r = 1;
			c = str.charAt(i);
			if(Character.isLetter(c) || c > '1' || c < '0') {
				flag = false;
				break;
			}
			if(c == '0' || c == '1') {
				flag = true;
				for(int j=len-1-1; j>=i; j--) {
					r *= n;
				}
				if(c == '0') {
					result += 0 * r;
				}else if ( c == '1') {
					result += 1 * r;
				}
			}
		}
		if(flag) {
			System.out.println("Decimal Number: " + result);
		}else {
			System.out.println("Invalid Binary String " + str);
		}
	}
}
