package Day1;
import java.util.Arrays;

public class Prog09 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("The array: ");
		System.out.println(Arrays.toString(arr));
		int temp;
		int a = arr.length - 1;	//last element
		
		//reversing the array
		System.out.println("Reversed: ");
		for(int i=a; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
