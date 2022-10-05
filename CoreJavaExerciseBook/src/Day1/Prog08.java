package Day1;
import java.util.Arrays;
import java.util.Scanner;

public class Prog08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {5, 9, 4, 6, 1};
		System.out.println("The array is: ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the element to find the location/index: ");
		int n = scan.nextInt();
		
		//finding index of the number
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n) {
				System.out.println("Index/location: " + i);
			}
		}
		
		
	}
}
