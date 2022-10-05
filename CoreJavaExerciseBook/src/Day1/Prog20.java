package Day1;
import java.util.Arrays;

public class Prog20 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,5}, {10,2}, {9,3}, {4,16}, {15,14}, {27,33} 
		};
		System.out.println("This is the array: ");
		System.out.println(Arrays.deepToString(arr));
		
		for(int i=0; i<arr.length; i++) {
				if(arr[i][0] > arr[i][1]) {
					System.out.println("In the row " + i + ", this element is greatest: " + arr[i][0]);
				}else {
					System.out.println("In the row " + i + ", this element is greates: " + arr[i][1]);
				}
		}
	}
}
